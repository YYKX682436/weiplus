package xe2;

/* loaded from: classes3.dex */
public final class c extends we2.z {

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f453839c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(gk2.e liveContext) {
        super(liveContext);
        kotlin.jvm.internal.o.g(liveContext, "liveContext");
        this.f453839c = "LiveAppMsgBulletInterceptor";
    }

    @Override // we2.z
    public void d(java.util.LinkedList msgList) {
        kotlin.jvm.internal.o.g(msgList, "msgList");
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        gk2.e eVar = this.f445267a;
        mm2.x4 x4Var = (mm2.x4) eVar.a(mm2.x4.class);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(msgList, 10));
        java.util.Iterator it = msgList.iterator();
        while (it.hasNext()) {
            arrayList.add(new dk2.w6((r45.ch1) it.next()));
        }
        x4Var.f329529g.addAll(arrayList);
        if (!zl2.q4.f473933a.E() || ((mm2.x4) eVar.a(mm2.x4.class)).f329529g.size() <= 0) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("handleBulletMsg size:");
        sb6.append(((mm2.x4) eVar.a(mm2.x4.class)).f329529g.size());
        sb6.append(',');
        java.util.List list = ((mm2.x4) eVar.a(mm2.x4.class)).f329529g;
        kotlin.jvm.internal.o.f(list, "<get-bulletCommetList>(...)");
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((dk2.zf) it6.next()).f());
        }
        sb6.append(arrayList2);
        com.tencent.mars.xlog.Log.i(this.f453839c, sb6.toString());
    }

    @Override // we2.z
    public int[] g() {
        return new int[]{20047};
    }
}
