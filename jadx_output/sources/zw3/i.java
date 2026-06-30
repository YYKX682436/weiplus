package zw3;

/* loaded from: classes.dex */
public final class i extends com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig
    public void initConfig() {
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root = root(com.tencent.mm.R.id.lxt);
        root.view(com.tencent.mm.R.id.f486631ly0).desc(zw3.a.f476872d);
        root.view(com.tencent.mm.R.id.lxl).desc(com.tencent.mm.R.string.i1r);
        root.view(com.tencent.mm.R.id.lxw).disable();
        root.view(com.tencent.mm.R.id.lxy).descFormat(com.tencent.mm.R.string.i1u).valueByView(com.tencent.mm.R.id.lxz);
        root.view(com.tencent.mm.R.id.lxo).descFormat(com.tencent.mm.R.string.i1t).valueByView(com.tencent.mm.R.id.lxn).valueByKey("number_key");
        root.view(com.tencent.mm.R.id.f486631ly0).type(com.tencent.mm.accessibility.type.ViewType.Button).desc(zw3.b.f476873d);
        root.view(com.tencent.mm.R.id.lxn).descFormat(com.tencent.mm.R.string.i1s).valueByView(com.tencent.mm.R.id.lxn);
        root(com.tencent.mm.R.layout.cex).view(com.tencent.mm.R.id.lxp).desc(zw3.e.f476876d);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root2 = root(com.tencent.mm.R.id.lxt);
        root2.disable(com.tencent.mm.R.id.lxx);
        root2.disable(com.tencent.mm.R.id.lxz);
        root2.disable(com.tencent.mm.R.id.lxt);
        focusFirst(com.tencent.mm.R.id.f486631ly0);
        focusOrder().next(com.tencent.mm.R.id.f486631ly0).next(com.tencent.mm.R.id.lxl).next(com.tencent.mm.R.id.f486635ly4).next(com.tencent.mm.R.id.f486636ly5);
        focusOrder().next(com.tencent.mm.R.id.lxm).next(com.tencent.mm.R.id.lxn);
        com.tencent.mm.accessibility.base.MMBaseAccessibilityConfig.ConfigHelper root3 = root(com.tencent.mm.R.layout.cen);
        java.util.Iterator it = kz5.c0.i(java.lang.Integer.valueOf(com.tencent.mm.R.id.lxl), java.lang.Integer.valueOf(com.tencent.mm.R.id.lxm), java.lang.Integer.valueOf(com.tencent.mm.R.id.lxy)).iterator();
        while (it.hasNext()) {
            root3.view(((java.lang.Number) it.next()).intValue()).type(com.tencent.mm.accessibility.type.ViewType.Button);
        }
        root(com.tencent.mm.R.layout.cen).view(com.tencent.mm.R.id.f486636ly5).talkOn(com.tencent.mm.R.string.i1v, zw3.f.f476877d);
        root(com.tencent.mm.R.layout.cen).view(com.tencent.mm.R.id.lxv).clickAs(com.tencent.mm.R.id.lxu);
        root(com.tencent.mm.R.layout.cen).view(com.tencent.mm.R.id.lxv).disableChildren();
        root(com.tencent.mm.R.layout.cen).view(com.tencent.mm.R.id.lxm).expand(40, 40, 40, 40);
        root(com.tencent.mm.R.layout.cen).view(com.tencent.mm.R.id.f486633ly2).disExpand();
        view(com.tencent.mm.R.layout.cen, com.tencent.mm.R.id.f486634ly3).desc(zw3.g.f476878d).checkOn(zw3.h.f476879d);
        view(com.tencent.mm.R.layout.cen, com.tencent.mm.R.id.f486634ly3).type(com.tencent.mm.accessibility.type.ViewType.SeekBar).onSeekForward(zw3.c.f476874d).onSeekBackward(zw3.d.f476875d);
    }
}
