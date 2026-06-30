package u92;

/* loaded from: classes2.dex */
public class e extends bz2.a {

    /* renamed from: h, reason: collision with root package name */
    public static final jz5.g f425824h;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f425825g;

    static {
        new u92.d(null);
        f425824h = jz5.h.b(u92.c.f425823d);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e(yz5.a r1, kotlinx.coroutines.r2 r2, androidx.lifecycle.y r3, u92.f r4, int r5, kotlin.jvm.internal.i r6) {
        /*
            r0 = this;
            r4 = r5 & 2
            r6 = 0
            if (r4 == 0) goto L6
            r2 = r6
        L6:
            r4 = r5 & 4
            if (r4 == 0) goto Lb
            r3 = r6
        Lb:
            java.lang.String r4 = "initTask"
            kotlin.jvm.internal.o.g(r1, r4)
            r0.<init>(r1, r2, r3)
            java.lang.String r1 = "FinderGetTopicInfoFutureTask"
            r0.f425825g = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: u92.e.<init>(yz5.a, kotlinx.coroutines.r2, androidx.lifecycle.y, u92.f, int, kotlin.jvm.internal.i):void");
    }

    @Override // ay1.l
    public by1.d a() {
        return new u92.b((java.lang.String) c());
    }

    @Override // ay1.l
    public java.lang.String f() {
        return this.f425825g;
    }

    @Override // ay1.l
    public void g(java.lang.Object obj) {
        r45.r03 r03Var;
        r45.q03 q03Var;
        java.util.LinkedList list;
        com.tencent.mm.modelbase.f cgiBack = (com.tencent.mm.modelbase.f) obj;
        kotlin.jvm.internal.o.g(cgiBack, "cgiBack");
        com.tencent.mars.xlog.Log.i(this.f425825g, "[onPreloadEnd] topicType:null errType:" + cgiBack.f70615a + " errCode:" + cgiBack.f70616b + " errMsg:" + cgiBack.f70617c);
        if (cgiBack.f70615a != 0 || cgiBack.f70616b != 0 || (r03Var = (r45.r03) ((r45.ma1) cgiBack.f70618d).getCustom(1)) == null || (q03Var = (r45.q03) r03Var.getCustom(20)) == null || (list = q03Var.getList(0)) == null) {
            return;
        }
    }
}
