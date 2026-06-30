package fk2;

/* loaded from: classes3.dex */
public final class j1 extends we2.o {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f263410m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1(we2.a commentItemDependency) {
        super(commentItemDependency);
        kotlin.jvm.internal.o.g(commentItemDependency, "commentItemDependency");
        this.f263410m = "CommentItemKTVSong";
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019f  */
    @Override // we2.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d(android.content.Context r35, bm2.h1 r36, dk2.zf r37, int r38) {
        /*
            Method dump skipped, instructions count: 625
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fk2.j1.d(android.content.Context, bm2.h1, dk2.zf, int):void");
    }

    @Override // we2.o
    public dk2.zf e(r45.ch1 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
        return new dk2.da(msg);
    }

    @Override // we2.o
    public int n() {
        return 20129;
    }

    public final void q(int i17, java.lang.String str) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", i17);
        jSONObject.put("req_unique_id", str);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        if (zl2.r4.f473950a.x1()) {
            i95.m c17 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            zy2.zb.y6((zy2.zb) c17, ml2.z4.f328367o2, jSONObject2, null, 4, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.r0.hj((ml2.r0) c18, ml2.b4.U2, jSONObject2, 0L, null, null, null, null, null, 252, null);
        }
    }
}
