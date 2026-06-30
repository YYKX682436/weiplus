package xe5;

/* loaded from: classes3.dex */
public final class c extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xe5.f f453989d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f453990e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ xe5.i f453991f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(xe5.f fVar, java.lang.String str, xe5.i iVar) {
        super(1);
        this.f453989d = fVar;
        this.f453990e = str;
        this.f453991f = iVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar != null && (i17 = fVar.f70615a) == 0 && i17 == 0) {
            int i18 = xe5.f.f454021i;
            this.f453989d.getClass();
            xe5.g0.f454026g.putBoolean(this.f453990e + "_game_team", false);
            android.widget.TextView textView = this.f453991f.f454050k;
            if (textView != null) {
                textView.setVisibility(8);
            }
        }
        return jz5.f0.f302826a;
    }
}
