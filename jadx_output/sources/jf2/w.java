package jf2;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore f299407a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f299408b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f299409c;

    public w(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store, java.util.List entranceBtnList) {
        kotlin.jvm.internal.o.g(store, "store");
        kotlin.jvm.internal.o.g(entranceBtnList, "entranceBtnList");
        this.f299407a = store;
        this.f299408b = entranceBtnList;
        this.f299409c = "LiveAnchorBottomEntrancePriorityHelper";
    }

    public final boolean a(int i17) {
        java.lang.Object obj;
        java.util.Iterator it = this.f299408b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((jf2.h) obj).type() == i17) {
                break;
            }
        }
        jf2.h hVar = (jf2.h) obj;
        if (hVar != null) {
            return hVar.i();
        }
        return false;
    }

    public final java.util.List b() {
        return kz5.c0.i(24, 18, 10, 25, 11, 16, 6, 8, 2);
    }

    public final jf2.v c() {
        return new jf2.v(kz5.c0.i(18, 10, 6, 2), null, 2, null);
    }
}
