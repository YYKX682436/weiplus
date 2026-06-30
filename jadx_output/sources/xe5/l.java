package xe5;

/* loaded from: classes3.dex */
public final class l implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xe5.i f454064a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f454065b;

    public l(xe5.i iVar, java.lang.String str) {
        this.f454064a = iVar;
        this.f454065b = str;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            android.widget.TextView textView = this.f454064a.f454050k;
            if (textView != null) {
                textView.setVisibility(0);
            }
            xe5.g0.f454026g.putBoolean(this.f454065b, true);
        }
        return jz5.f0.f302826a;
    }
}
