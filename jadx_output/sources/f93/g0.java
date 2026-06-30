package f93;

/* loaded from: classes11.dex */
public final class g0 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactEditLabel f260340d;

    public g0(com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel) {
        this.f260340d = contactEditLabel;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.label.ui.ContactEditLabel contactEditLabel = this.f260340d;
        android.widget.EditText editText = contactEditLabel.D;
        if (editText == null) {
            kotlin.jvm.internal.o.o("searchET");
            throw null;
        }
        java.lang.String query = editText.getText().toString();
        f93.y yVar = contactEditLabel.A;
        if (yVar == null) {
            kotlin.jvm.internal.o.o("adapter");
            throw null;
        }
        kotlin.jvm.internal.o.g(query, "query");
        if (!r26.i0.p(yVar.f260513q, query, true)) {
            yVar.f260513q = query;
        }
        yVar.s();
        com.tencent.mars.xlog.Log.i(yVar.f260515s.f143191d, "query ".concat(query));
        return false;
    }
}
