package df5;

/* loaded from: classes11.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df5.t f232196d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(df5.t tVar) {
        super(1);
        this.f232196d = tVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        df5.t tVar = this.f232196d;
        yz5.l lVar = tVar.f232212e;
        if (lVar != null) {
            lVar.invoke(java.lang.Boolean.valueOf(booleanValue));
        }
        df5.u1 u1Var = tVar.f232210c;
        if (!booleanValue && tVar.f232211d) {
            android.widget.TextView textView = tVar.f232209b.f232065e;
            if (textView != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MarkdownStreamAnimController", "[STREAM_ANIM] feeder idle + stream active, starting waiting dots");
                u1Var.b(textView);
            }
        } else if (booleanValue && u1Var.f232229j) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MarkdownStreamAnimController", "[STREAM_ANIM] feeder busy, stopping waiting dots");
            u1Var.c();
        }
        return jz5.f0.f302826a;
    }
}
