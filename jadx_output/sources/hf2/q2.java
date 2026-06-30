package hf2;

/* loaded from: classes10.dex */
public final class q2 {

    /* renamed from: a, reason: collision with root package name */
    public final hf2.x f281148a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f281149b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f281150c;

    /* renamed from: d, reason: collision with root package name */
    public hf2.n2 f281151d;

    public q2(hf2.x controller) {
        kotlin.jvm.internal.o.g(controller, "controller");
        this.f281148a = controller;
        this.f281149b = controller.f281181m + "_Touch";
        this.f281150c = jz5.h.b(new hf2.p2(this));
    }

    public static final hf2.r2 c(hf2.q2 q2Var, float f17, float f18, int i17, int i18, float f19) {
        float width = f17 * q2Var.f281148a.f281189u.f281161b.getWidth();
        float height = f18 * r1.f281189u.f281161b.getHeight();
        float f27 = i17 * f19;
        float f28 = i18 * f19;
        android.graphics.Point point = q2Var.f281148a.f281189u.f281160a;
        float f29 = point.x + width;
        float f37 = 2;
        return new hf2.r2(new android.graphics.Point((int) (f29 - (f27 / f37)), (int) ((point.y + height) - (f28 / f37))), new android.util.Size((int) f27, (int) f28));
    }

    public final void a() {
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var;
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("addTouchListener ");
        jz5.g gVar = this.f281150c;
        sb6.append((hf2.o2) ((jz5.n) gVar).getValue());
        com.tencent.mars.xlog.Log.i(this.f281149b, sb6.toString());
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f281148a.f291099e;
        if (ubVar == null || (o9Var = (com.tencent.mm.plugin.finder.live.plugin.o9) ubVar.getPlugin(com.tencent.mm.plugin.finder.live.plugin.o9.class)) == null || (livePreviewView = o9Var.f113717r) == null) {
            return;
        }
        livePreviewView.b((hf2.o2) ((jz5.n) gVar).getValue(), true);
    }

    public final java.util.LinkedList b(android.view.View view) {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        hf2.x xVar = this.f281148a;
        r45.ei0 ei0Var = xVar.f281185q;
        if (ei0Var != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            java.lang.String str = "calculateStickerLocationInfo new anchorLocationInfo:" + new hf2.r2(new android.graphics.Point(iArr[0], iArr[1]), new android.util.Size(view.getWidth(), view.getHeight())) + ", cache anchorLocationInfo:" + xVar.f281189u;
            java.lang.String str2 = this.f281149b;
            com.tencent.mars.xlog.Log.i(str2, str);
            java.util.LinkedList<r45.ji0> textItemRestoreDataList = ei0Var.f373529d;
            kotlin.jvm.internal.o.f(textItemRestoreDataList, "textItemRestoreDataList");
            for (r45.ji0 ji0Var : textItemRestoreDataList) {
                hf2.r2 c17 = c(this, ji0Var.f377822d, ji0Var.f377823e, ji0Var.f377830o, ji0Var.f377831p, ji0Var.f377827i);
                linkedList.add(new hf2.m2(1, c17));
                com.tencent.mars.xlog.Log.i(str2, "calculateStickerLocationInfo textLocation:" + c17);
            }
            java.util.LinkedList<r45.gi0> picItemRestoreDataList = ei0Var.f373530e;
            kotlin.jvm.internal.o.f(picItemRestoreDataList, "picItemRestoreDataList");
            for (r45.gi0 gi0Var : picItemRestoreDataList) {
                hf2.r2 c18 = c(this, gi0Var.f375268d, gi0Var.f375269e, gi0Var.f375274m, gi0Var.f375275n, gi0Var.f375270f);
                linkedList.add(new hf2.m2(2, c18));
                com.tencent.mars.xlog.Log.i(str2, "calculateStickerLocationInfo picLocation:" + c18);
            }
        }
        return linkedList;
    }

    public final void d() {
        com.tencent.mm.plugin.finder.live.plugin.o9 o9Var;
        com.tencent.mm.live.core.view.LivePreviewView livePreviewView;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("removeTouchListener ");
        jz5.g gVar = this.f281150c;
        sb6.append((hf2.o2) ((jz5.n) gVar).getValue());
        com.tencent.mars.xlog.Log.i(this.f281149b, sb6.toString());
        com.tencent.mm.plugin.finder.live.view.ub ubVar = this.f281148a.f291099e;
        if (ubVar == null || (o9Var = (com.tencent.mm.plugin.finder.live.plugin.o9) ubVar.getPlugin(com.tencent.mm.plugin.finder.live.plugin.o9.class)) == null || (livePreviewView = o9Var.f113717r) == null) {
            return;
        }
        livePreviewView.e((hf2.o2) ((jz5.n) gVar).getValue());
    }

    public final boolean e(float f17, float f18, hf2.m2 m2Var) {
        if (f17 >= m2Var.f281117b.f281160a.x && f17 <= r1 + r0.f281161b.getWidth()) {
            if (f18 >= m2Var.f281117b.f281160a.y && f18 <= r6 + r4.f281161b.getHeight()) {
                return true;
            }
        }
        return false;
    }
}
