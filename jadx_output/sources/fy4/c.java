package fy4;

/* loaded from: classes8.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fy4.e f267255d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(fy4.e eVar, java.lang.String str) {
        super(0);
        this.f267255d = eVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        fy4.e eVar = this.f267255d;
        if (!eVar.f267259d.isFinishing()) {
            com.tencent.mm.ui.widget.MMWebView mMWebView = eVar.f267259d.f183815f;
            if (!mMWebView.f211376y) {
                mMWebView.evaluateJavascript("(function() { window.__bottomInputBarInsertHardBreak ? window.__bottomInputBarInsertHardBreak() : (function() {\n  var activeElement = document.activeElement;\n  if (!activeElement) return;\n  if (activeElement.nodeName === 'TEXTAREA') {\n    var oldValue = activeElement.value;\n    var selectionStart = activeElement.selectionStart;\n    activeElement.value = oldValue.slice(0, selectionStart) + '\\n' + oldValue.slice(activeElement.selectionEnd);\n    activeElement.selectionStart = selectionStart + 1;\n    activeElement.selectionEnd = selectionStart + 1;\n    activeElement.dispatchEvent(new Event('input'));\n  } else if (activeElement.getAttribute('contenteditable') === 'true') {\n    var selection = window.getSelection();\n    if (selection.rangeCount > 0) {\n      var range = selection.getRangeAt(0);\n      var br = document.createElement('br');\n      range.insertNode(br);\n      range.setStartAfter(br);\n      range.setEndAfter(br);\n      selection.removeAllRanges();\n      selection.addRange(range);\n      activeElement.dispatchEvent(new Event('input'));\n    }\n  }\n})(); })()", fy4.b.f267254a);
                return jz5.f0.f302826a;
            }
        }
        com.tencent.mars.xlog.Log.w("MicroMsg.WebviewInputConnectionHelper", "webview is isFinishing, skip insertLineBreak");
        return jz5.f0.f302826a;
    }
}
