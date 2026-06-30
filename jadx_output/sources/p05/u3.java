package p05;

/* loaded from: classes5.dex */
public final class u3 extends ea5.l {

    /* renamed from: d, reason: collision with root package name */
    public static final p05.t3 f350699d = new p05.t3(null);

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public boolean addToPeriod() {
        return true;
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.util.ArrayList getParameter() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.tencent.wechat.aff.udr.v vVar = new com.tencent.wechat.aff.udr.v();
        vVar.d("wevision_version");
        if (tq5.i.f421269a == 0) {
            tq5.i.f421269a = 2014500;
        }
        vVar.c(tq5.i.f421269a);
        vVar.e(1);
        arrayList.add(vVar);
        return arrayList;
    }

    @Override // ea5.l, com.tencent.wechat.aff.udr.i
    public java.lang.String getProjectId() {
        return "ilinkres_c42c04f5";
    }
}
