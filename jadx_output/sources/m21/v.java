package m21;

/* loaded from: classes4.dex */
public class v implements m21.u {

    /* renamed from: a, reason: collision with root package name */
    public r45.km6 f323001a = new r45.km6();

    public static java.lang.String b(com.tencent.mm.protocal.protobuf.TimeLineObject timeLineObject) {
        r45.a90 a90Var;
        java.util.LinkedList linkedList;
        java.lang.String str = null;
        r45.jj4 jj4Var = (timeLineObject == null || (a90Var = timeLineObject.ContentObj) == null || (linkedList = a90Var.f369840h) == null || linkedList.size() <= 0) ? null : (r45.jj4) timeLineObject.ContentObj.f369840h.get(0);
        if (jj4Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(jj4Var.f377858g)) {
            str = jj4Var.f377858g;
        }
        return (com.tencent.mm.sdk.platformtools.t8.K0(str) || str.startsWith("http")) ? str : "";
    }

    @Override // m21.u
    public java.lang.String a() {
        qk.i9 i9Var = (qk.i9) i95.n0.c(qk.i9.class);
        r45.km6 shareObj = this.f323001a;
        ((ef0.l4) i9Var).getClass();
        kotlin.jvm.internal.o.g(shareObj, "shareObj");
        return cl4.g.a(shareObj);
    }
}
