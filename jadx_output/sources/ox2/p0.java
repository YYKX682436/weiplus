package ox2;

/* loaded from: classes2.dex */
public abstract class p0 {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f349702a = new int[2];

    public static final com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg a(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 s0Var) {
        if (!b(qeVar)) {
            return null;
        }
        com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg = (com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg) s0Var.p(com.tencent.mm.R.id.tfm);
        if (centerInteractionEasterEgg != null) {
            return centerInteractionEasterEgg;
        }
        try {
            com.tencent.mars.xlog.Log.i("FinderFeedFullConvert+InteractionEasterEgg", "getEasterEggCenter: inflate");
            android.view.View inflate = com.tencent.mm.ui.id.b(s0Var.f293121e).inflate(com.tencent.mm.R.layout.e5r, (android.view.ViewGroup) null);
            com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg2 = inflate instanceof com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg ? (com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg) inflate : null;
            if (centerInteractionEasterEgg2 != null) {
                try {
                    android.view.ViewGroup viewGroup = (android.view.ViewGroup) s0Var.p(com.tencent.mm.R.id.jdk);
                    if (viewGroup != null) {
                        viewGroup.addView(centerInteractionEasterEgg2);
                    }
                    com.tencent.mars.xlog.Log.i("FinderFeedFullConvert+InteractionEasterEgg", "getEasterEggCenter: addView");
                } catch (java.lang.Throwable th6) {
                    th = th6;
                    centerInteractionEasterEgg = centerInteractionEasterEgg2;
                    com.tencent.mars.xlog.Log.e("FinderFeedFullConvert+InteractionEasterEgg", "getEasterEggCenter: " + th);
                    return centerInteractionEasterEgg;
                }
            }
            return centerInteractionEasterEgg2;
        } catch (java.lang.Throwable th7) {
            th = th7;
        }
    }

    public static final boolean b(com.tencent.mm.plugin.finder.convert.qe qeVar) {
        kotlin.jvm.internal.o.g(qeVar, "<this>");
        return (qeVar instanceof com.tencent.mm.plugin.finder.convert.df) || (qeVar instanceof com.tencent.mm.plugin.finder.convert.bh);
    }

    public static final boolean c(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 holder) {
        com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg centerInteractionEasterEgg;
        kotlin.jvm.internal.o.g(qeVar, "<this>");
        kotlin.jvm.internal.o.g(holder, "holder");
        return b(qeVar) && (centerInteractionEasterEgg = (com.tencent.mm.plugin.finder.view.interactioneasteregg.CenterInteractionEasterEgg) holder.p(com.tencent.mm.R.id.tfm)) != null && centerInteractionEasterEgg.getEmojiDownloadComplete();
    }

    public static final void d(com.tencent.mm.plugin.finder.convert.qe qeVar, in5.s0 holder, com.tencent.mm.plugin.finder.model.BaseFinderFeed item) {
        r45.t11 t11Var;
        kotlin.jvm.internal.o.g(qeVar, "<this>");
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        if (b(qeVar)) {
            r45.dm2 object_extend = item.getFeedObject().getFeedObject().getObject_extend();
            r45.ri0 ri0Var = (object_extend == null || (t11Var = (r45.t11) object_extend.getCustom(60)) == null) ? null : (r45.ri0) t11Var.getCustom(1);
            if (ri0Var == null) {
                com.tencent.mars.xlog.Log.i("FinderFeedFullConvert+InteractionEasterEgg", item.getItemId() + " 没有可用的彩蛋");
            } else {
                com.tencent.mars.xlog.Log.i("FinderFeedFullConvert+InteractionEasterEgg", item.getItemId() + " 有可用的彩蛋");
            }
            java.lang.Object tag = holder.itemView.getTag(com.tencent.mm.R.id.tbw);
            java.lang.Runnable runnable = tag instanceof java.lang.Runnable ? (java.lang.Runnable) tag : null;
            if (runnable != null) {
                holder.itemView.removeCallbacks(runnable);
            }
            holder.itemView.setTag(com.tencent.mm.R.id.tbw, null);
            ox2.o0 o0Var = new ox2.o0(holder, item.getItemId(), qeVar, item, ri0Var);
            holder.itemView.setTag(com.tencent.mm.R.id.tbw, o0Var);
            android.view.View view = holder.itemView;
            cq.k1.a();
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            view.postDelayed(o0Var, ((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.f127915rb).getValue()).r()).intValue());
        }
    }
}
