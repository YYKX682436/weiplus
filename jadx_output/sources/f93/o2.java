package f93;

/* loaded from: classes11.dex */
public final class o2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f260409d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI f260410e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f260411f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f260412g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o2(com.tencent.mm.plugin.label.ui.ContactLabelRecommendUI contactLabelRecommendUI, java.util.ArrayList arrayList, java.util.ArrayList arrayList2, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f260410e = contactLabelRecommendUI;
        this.f260411f = arrayList;
        this.f260412g = arrayList2;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new f93.o2(this.f260410e, this.f260411f, this.f260412g, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((f93.o2) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        int i17 = this.f260409d;
        if (i17 == 0) {
            kotlin.ResultKt.throwOnFailure(obj);
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310570c;
            f93.n2 n2Var = new f93.n2(this.f260412g, this.f260411f, null);
            this.f260409d = 1;
            obj = kotlinx.coroutines.l.g(p0Var, n2Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.ResultKt.throwOnFailure(obj);
        }
        java.util.LinkedList linkedList = (java.util.LinkedList) obj;
        jz5.f0 f0Var = jz5.f0.f302826a;
        if (linkedList == null) {
            android.app.ProgressDialog progressDialog = this.f260410e.f143270p;
            if (progressDialog != null && progressDialog.isShowing()) {
                progressDialog.dismiss();
            }
            return f0Var;
        }
        new com.tencent.mm.autogen.events.UpdateSearchIndexAtOnceEvent().e();
        ((com.tencent.mm.plugin.messenger.foundation.g) vg3.n3.f436736n1.a()).wi(new vg3.e(vg3.d.f436681g, vg3.b.f436645e, vg3.c.f436671z, 0, this.f260411f, 8, null));
        c01.d9.e().g(new e93.e(linkedList));
        return f0Var;
    }
}
