package mz0;

/* loaded from: classes5.dex */
public final /* synthetic */ class z extends kotlin.jvm.internal.m implements yz5.l {
    public z(java.lang.Object obj) {
        super(1, obj, mz0.b2.class, "onBottomSheetStateUpdate", "onBottomSheetStateUpdate(Lcom/tencent/mm/mj_template/sns/compose/BottomSheetState;)V", 0);
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        kz0.a aVar = (kz0.a) obj;
        mz0.b2 b2Var = (mz0.b2) this.receiver;
        if (b2Var.f332890n != aVar) {
            b2Var.f332890n = aVar;
            com.tencent.mars.xlog.Log.i("MicroMsg.Template.TemplateControlUIC", "onBottomSheetStateUpdate: " + aVar);
        }
        return jz5.f0.f302826a;
    }
}
