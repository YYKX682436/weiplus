package kz0;

/* loaded from: classes3.dex */
public final class o0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.y f313789d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(com.tencent.mm.mj_template.sns.compose.widget.y yVar) {
        super(1);
        this.f313789d = yVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.mj_template.sns.compose.widget.y yVar = this.f313789d;
        yVar.f70329h = false;
        if (booleanValue) {
            yVar.f70325d.invoke();
        } else {
            yVar.f70326e.invoke();
        }
        return jz5.f0.f302826a;
    }
}
