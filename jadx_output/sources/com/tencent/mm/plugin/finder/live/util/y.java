package com.tencent.mm.plugin.finder.live.util;

/* loaded from: classes3.dex */
public abstract class y {
    public static kotlinx.coroutines.r2 a(com.tencent.mm.plugin.finder.live.plugin.l lVar, oz5.l context, kotlinx.coroutines.a1 start, yz5.p block, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            context = oz5.m.f350329d;
        }
        if ((i17 & 2) != 0) {
            start = kotlinx.coroutines.a1.DEFAULT;
        }
        kotlin.jvm.internal.o.g(lVar, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        qo0.c cVar = lVar.f113325g;
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        return kotlinx.coroutines.l.c(((com.tencent.mm.plugin.finder.live.view.k0) cVar).getActivityScope(), context, start, block);
    }

    public static final kotlinx.coroutines.r2 b(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController, oz5.l context, kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(liveRoomController, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        return kotlinx.coroutines.l.c(liveRoomController.getStore().getLiveRoomData().f272475i, context, start, block);
    }

    public static final kotlinx.coroutines.r2 c(com.tencent.mm.plugin.finder.live.view.k0 k0Var, oz5.l context, kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(k0Var, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        return kotlinx.coroutines.l.c(k0Var.getBuContext().f272475i, context, start, block);
    }

    public static /* synthetic */ kotlinx.coroutines.r2 d(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController liveRoomController, oz5.l lVar, kotlinx.coroutines.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f350329d;
        }
        if ((i17 & 2) != 0) {
            a1Var = kotlinx.coroutines.a1.DEFAULT;
        }
        return b(liveRoomController, lVar, a1Var, pVar);
    }

    public static kotlinx.coroutines.r2 e(com.tencent.mm.plugin.finder.live.plugin.l lVar, oz5.l context, kotlinx.coroutines.a1 start, yz5.p block, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            context = oz5.m.f350329d;
        }
        if ((i17 & 2) != 0) {
            start = kotlinx.coroutines.a1.DEFAULT;
        }
        kotlin.jvm.internal.o.g(lVar, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        qo0.c cVar = lVar.f113325g;
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        return c((com.tencent.mm.plugin.finder.live.view.k0) cVar, context, start, block);
    }

    public static /* synthetic */ kotlinx.coroutines.r2 f(com.tencent.mm.plugin.finder.live.view.k0 k0Var, oz5.l lVar, kotlinx.coroutines.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f350329d;
        }
        if ((i17 & 2) != 0) {
            a1Var = kotlinx.coroutines.a1.DEFAULT;
        }
        return c(k0Var, lVar, a1Var, pVar);
    }

    public static final kotlinx.coroutines.f1 g(com.tencent.mm.plugin.finder.live.plugin.l lVar, oz5.l context, kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(lVar, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        qo0.c cVar = lVar.f113325g;
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        return h((com.tencent.mm.plugin.finder.live.view.k0) cVar, context, start, block);
    }

    public static final kotlinx.coroutines.f1 h(com.tencent.mm.plugin.finder.live.view.k0 k0Var, oz5.l context, kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(k0Var, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        return kotlinx.coroutines.l.a(k0Var.getViewScope(), context, start, block);
    }

    public static final kotlinx.coroutines.f1 i(if2.b bVar, oz5.l context, kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(bVar, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        com.tencent.mm.plugin.finder.live.view.ub ubVar = bVar.f291099e;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
        if (k0Var != null) {
            return h(k0Var, context, start, block);
        }
        return null;
    }

    public static final kotlinx.coroutines.r2 j(com.tencent.mm.plugin.finder.live.plugin.l lVar, oz5.l context, kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(lVar, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        qo0.c cVar = lVar.f113325g;
        kotlin.jvm.internal.o.e(cVar, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.live.view.FinderBaseLivePluginLayout");
        return k((com.tencent.mm.plugin.finder.live.view.k0) cVar, context, start, block);
    }

    public static final kotlinx.coroutines.r2 k(com.tencent.mm.plugin.finder.live.view.k0 k0Var, oz5.l context, kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(k0Var, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        return kotlinx.coroutines.l.c(k0Var.getViewScope(), context, start, block);
    }

    public static final kotlinx.coroutines.r2 l(if2.b bVar, oz5.l context, kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(bVar, "<this>");
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        com.tencent.mm.plugin.finder.live.view.ub ubVar = bVar.f291099e;
        com.tencent.mm.plugin.finder.live.view.k0 k0Var = ubVar instanceof com.tencent.mm.plugin.finder.live.view.k0 ? (com.tencent.mm.plugin.finder.live.view.k0) ubVar : null;
        if (k0Var != null) {
            return k(k0Var, context, start, block);
        }
        return null;
    }

    public static /* synthetic */ kotlinx.coroutines.r2 m(com.tencent.mm.plugin.finder.live.plugin.l lVar, oz5.l lVar2, kotlinx.coroutines.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            lVar2 = oz5.m.f350329d;
        }
        if ((i17 & 2) != 0) {
            a1Var = kotlinx.coroutines.a1.DEFAULT;
        }
        return j(lVar, lVar2, a1Var, pVar);
    }

    public static /* synthetic */ kotlinx.coroutines.r2 n(com.tencent.mm.plugin.finder.live.view.k0 k0Var, oz5.l lVar, kotlinx.coroutines.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f350329d;
        }
        if ((i17 & 2) != 0) {
            a1Var = kotlinx.coroutines.a1.DEFAULT;
        }
        return k(k0Var, lVar, a1Var, pVar);
    }

    public static /* synthetic */ kotlinx.coroutines.r2 o(if2.b bVar, oz5.l lVar, kotlinx.coroutines.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            lVar = oz5.m.f350329d;
        }
        if ((i17 & 2) != 0) {
            a1Var = kotlinx.coroutines.a1.DEFAULT;
        }
        return l(bVar, lVar, a1Var, pVar);
    }
}
