package ku;

/* loaded from: classes9.dex */
public final class l extends ku.a {
    @Override // gu.e
    public boolean a(oi3.g simpleMsgInfo, s15.h recordDataItem) {
        kotlin.jvm.internal.o.g(simpleMsgInfo, "simpleMsgInfo");
        kotlin.jvm.internal.o.g(recordDataItem, "recordDataItem");
        w21.u0 u0Var = new w21.u0(simpleMsgInfo.getString(simpleMsgInfo.f345617d + 13));
        int i17 = recordDataItem.f303422d;
        recordDataItem.set(i17 + 2, 1);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(com.tencent.mm.sdk.platformtools.x2.g(com.tencent.mm.R.string.f490600zm));
        sb6.append(' ');
        ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).getClass();
        sb6.append((int) java.lang.Math.ceil(w21.x0.m(u0Var.f442480b)));
        sb6.append('\"');
        recordDataItem.set(i17 + 1, sb6.toString());
        return true;
    }
}
