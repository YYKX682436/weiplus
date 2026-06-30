package kz0;

/* loaded from: classes3.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.y f313781d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(com.tencent.mm.mj_template.sns.compose.widget.y yVar) {
        super(1);
        this.f313781d = yVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.mj_template.sns.compose.widget.y yVar = this.f313781d;
        if (!yVar.f70329h && yVar.f70330i != booleanValue) {
            yVar.f70329h = true;
        }
        yVar.f70330i = booleanValue;
        if (booleanValue) {
            yVar.f70323b.invoke();
        } else {
            yVar.f70324c.invoke();
        }
        return jz5.f0.f302826a;
    }
}
