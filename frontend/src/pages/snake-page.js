import {html, LitElement} from "lit";

export class SnakePage extends LitElement {
    constructor() {
        super();
    }

    render() {
        return html`
            <h1>Battlesnake</h1>
        `
    }
}

window.customElements.define('snake-page', SnakePage);