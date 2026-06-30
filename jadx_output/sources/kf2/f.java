package kf2;

/* loaded from: classes.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.controller.gamependant.GamePendantContainer f307221d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f307222e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f307223f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(com.tencent.mm.plugin.finder.live.controller.gamependant.GamePendantContainer gamePendantContainer, java.util.List list, java.util.List list2) {
        super(0);
        this.f307221d = gamePendantContainer;
        this.f307222e = list;
        this.f307223f = list2;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.controller.gamependant.GamePendantContainer gamePendantContainer = this.f307221d;
        java.lang.String str = gamePendantContainer.f111585d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateRect vertical from:");
        java.util.ArrayList arrayList = gamePendantContainer.f111586e;
        sb6.append(kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null));
        sb6.append(", horizontal from:");
        java.util.ArrayList arrayList2 = gamePendantContainer.f111587f;
        sb6.append(kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null));
        com.tencent.mars.xlog.Log.i(str, sb6.toString());
        arrayList.clear();
        arrayList2.clear();
        java.util.List list = this.f307222e;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList3.add(gamePendantContainer.a((android.graphics.RectF) it.next()));
        }
        arrayList.addAll(arrayList3);
        java.util.List list2 = this.f307223f;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it6 = list2.iterator();
        while (it6.hasNext()) {
            arrayList4.add(gamePendantContainer.a((android.graphics.RectF) it6.next()));
        }
        arrayList2.addAll(arrayList4);
        com.tencent.mars.xlog.Log.i(gamePendantContainer.f111585d, "updateRect vertical to:" + kz5.n0.g0(arrayList, ",", null, null, 0, null, null, 62, null) + ", horizontal to:" + kz5.n0.g0(arrayList2, ",", null, null, 0, null, null, 62, null));
        return jz5.f0.f302826a;
    }
}
