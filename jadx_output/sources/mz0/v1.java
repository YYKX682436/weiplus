package mz0;

/* loaded from: classes5.dex */
public final class v1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ mz0.b2 f333071d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(mz0.b2 b2Var) {
        super(0);
        this.f333071d = b2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        mz0.b2 b2Var = this.f333071d;
        android.app.Activity context = b2Var.getContext();
        kotlin.jvm.internal.o.g(context, "context");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        dz0.l lVar = (dz0.l) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(dz0.l.class);
        mz0.u1 u1Var = new mz0.u1(b2Var);
        dz0.v vVar = new dz0.v((com.tencent.mm.mj_template.maas.uic.MaasSdkUIC) lVar);
        vVar.f245034f = u1Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.ArrayList parcelableArrayListExtra = b2Var.getIntent().getParcelableArrayListExtra("Template_Media_List");
        if (parcelableArrayListExtra != null) {
            arrayList.addAll(parcelableArrayListExtra);
        }
        java.util.ArrayList arrayList2 = (java.util.ArrayList) vVar.f245029a;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        com.tencent.mars.xlog.Log.i("MicroMsg.MJSegmentClipBehaviorHolder", "setupMediaItemList: " + arrayList.size());
        return vVar;
    }
}
