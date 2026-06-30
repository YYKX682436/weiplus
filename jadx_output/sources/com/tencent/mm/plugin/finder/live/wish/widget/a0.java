package com.tencent.mm.plugin.finder.live.wish.widget;

/* loaded from: classes3.dex */
public final class a0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.wish.widget.t0 f120684d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var) {
        super(1);
        this.f120684d = t0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String str;
        r45.kv1 kv1Var;
        java.lang.String string;
        r45.kv1 kv1Var2;
        java.lang.String str2;
        java.lang.String str3;
        r45.kv1 kv1Var3;
        r45.kv1 kv1Var4;
        ln2.f fVar = (ln2.f) obj;
        com.tencent.mm.plugin.finder.live.wish.widget.t0 t0Var = this.f120684d;
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = t0Var.A;
        if (constraintLayout == null) {
            kotlin.jvm.internal.o.o("giftPanelLayout");
            throw null;
        }
        int childCount = constraintLayout.getChildCount();
        java.util.LinkedHashMap linkedHashMap = t0Var.f120785v;
        java.util.LinkedHashMap linkedHashMap2 = t0Var.f120786w;
        java.lang.String str4 = "NULL_ITEM";
        if (childCount != 3 || linkedHashMap2.containsKey("NULL_ITEM")) {
            if (fVar == null || (kv1Var2 = fVar.f319890a) == null || (str = kv1Var2.getString(0)) == null) {
                str = "NULL_ITEM";
            }
            ln2.f fVar2 = (ln2.f) linkedHashMap.remove(str);
            if (fVar2 != null && (kv1Var = fVar2.f319890a) != null && (string = kv1Var.getString(0)) != null) {
                str4 = string;
            }
            com.tencent.mm.plugin.finder.live.wish.widget.y yVar = (com.tencent.mm.plugin.finder.live.wish.widget.y) linkedHashMap2.remove(str4);
            if (yVar != null) {
                androidx.constraintlayout.widget.ConstraintLayout constraintLayout2 = t0Var.A;
                if (constraintLayout2 == null) {
                    kotlin.jvm.internal.o.o("giftPanelLayout");
                    throw null;
                }
                android.view.View rootView = yVar.f120813e;
                kotlin.jvm.internal.o.f(rootView, "rootView");
                constraintLayout2.removeView(rootView);
            }
        } else {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("add view size = MAX: ");
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout3 = t0Var.A;
            if (constraintLayout3 == null) {
                kotlin.jvm.internal.o.o("giftPanelLayout");
                throw null;
            }
            sb6.append(constraintLayout3.getChildCount());
            com.tencent.mars.xlog.Log.i("WishEditPanelWidget", sb6.toString());
            if (fVar == null || (kv1Var4 = fVar.f319890a) == null || (str2 = kv1Var4.getString(0)) == null) {
                str2 = "NULL_ITEM";
            }
            linkedHashMap.remove(str2);
            if (fVar == null || (kv1Var3 = fVar.f319890a) == null || (str3 = kv1Var3.getString(0)) == null) {
                str3 = "NULL_ITEM";
            }
            com.tencent.mm.plugin.finder.live.wish.widget.y yVar2 = (com.tencent.mm.plugin.finder.live.wish.widget.y) linkedHashMap2.remove(str3);
            if (yVar2 != null) {
                linkedHashMap.put("NULL_ITEM", null);
                yVar2.a(null);
                linkedHashMap2.put("NULL_ITEM", yVar2);
            }
        }
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout4 = t0Var.A;
        if (constraintLayout4 == null) {
            kotlin.jvm.internal.o.o("giftPanelLayout");
            throw null;
        }
        constraintLayout4.removeAllViews();
        for (java.util.Map.Entry entry : linkedHashMap2.entrySet()) {
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout5 = t0Var.A;
            if (constraintLayout5 == null) {
                kotlin.jvm.internal.o.o("giftPanelLayout");
                throw null;
            }
            android.view.View rootView2 = ((com.tencent.mm.plugin.finder.live.wish.widget.y) entry.getValue()).f120813e;
            kotlin.jvm.internal.o.f(rootView2, "rootView");
            constraintLayout5.addView(rootView2);
        }
        t0Var.I();
        t0Var.B();
        return jz5.f0.f302826a;
    }
}
