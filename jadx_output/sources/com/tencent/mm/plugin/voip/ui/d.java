package com.tencent.mm.plugin.voip.ui;

/* loaded from: classes5.dex */
public final class d extends in5.r {

    /* renamed from: e, reason: collision with root package name */
    public final yz5.p f176945e;

    public d(yz5.p onValueChanged) {
        kotlin.jvm.internal.o.g(onValueChanged, "onValueChanged");
        this.f176945e = onValueChanged;
    }

    @Override // in5.r
    public int e() {
        return com.tencent.mm.R.layout.cgb;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // in5.r
    public void h(in5.s0 holder, in5.c cVar, int i17, int i18, boolean z17, java.util.List list) {
        java.lang.String str;
        com.tencent.mm.plugin.voip.ui.a item = (com.tencent.mm.plugin.voip.ui.a) cVar;
        kotlin.jvm.internal.o.g(holder, "holder");
        kotlin.jvm.internal.o.g(item, "item");
        int i19 = com.tencent.mm.plugin.voip.ui.RepairerVoipFaceBeautyUI.g;
        java.lang.String config = item.f176935d;
        kotlin.jvm.internal.o.g(config, "config");
        switch (config.hashCode()) {
            case -2097631529:
                if (config.equals("skinBright")) {
                    str = "美白";
                    break;
                }
                str = "未知配置";
                break;
            case -2069664037:
                if (config.equals("enableFilter")) {
                    str = "启用滤镜";
                    break;
                }
                str = "未知配置";
                break;
            case -1932026754:
                if (config.equals("hairLineLow")) {
                    str = "低发际线";
                    break;
                }
                str = "未知配置";
                break;
            case -1788224341:
                if (config.equals("faceMorph")) {
                    str = "瘦脸";
                    break;
                }
                str = "未知配置";
                break;
            case -1623590009:
                if (config.equals("smallHead")) {
                    str = "小头";
                    break;
                }
                str = "未知配置";
                break;
            case -1615366773:
                if (config.equals("skinSmooth")) {
                    str = "磨皮";
                    break;
                }
                str = "未知配置";
                break;
            case -1553133448:
                if (config.equals("filterRate")) {
                    str = "自然滤镜";
                    break;
                }
                str = "未知配置";
                break;
            case -1438036128:
                if (config.equals("zhaiLian")) {
                    str = "窄脸";
                    break;
                }
                str = "未知配置";
                break;
            case -1389202159:
                if (config.equals("bigEye")) {
                    str = "大眼，新版";
                    break;
                }
                str = "未知配置";
                break;
            case -1384944297:
                if (config.equals("eyeMorph")) {
                    str = "大眼，旧版";
                    break;
                }
                str = "未知配置";
                break;
            case -1382171254:
                if (config.equals("eyePouch")) {
                    str = "祛黑眼圈";
                    break;
                }
                str = "未知配置";
                break;
            case -701917643:
                if (config.equals("wingOfNose")) {
                    str = "瘦鼻翼";
                    break;
                }
                str = "未知配置";
                break;
            case -296026997:
                if (config.equals("eyeBright")) {
                    str = "亮眼";
                    break;
                }
                str = "未知配置";
                break;
            case -53010862:
                if (config.equals("chinShort")) {
                    str = "短下巴";
                    break;
                }
                str = "未知配置";
                break;
            case 3506531:
                if (config.equals("rosy")) {
                    str = "红润";
                    break;
                }
                str = "未知配置";
                break;
            case 73209129:
                if (config.equals("boySlim")) {
                    str = "瘦脸男神";
                    break;
                }
                str = "未知配置";
                break;
            case 236587448:
                if (config.equals("hairLineHigh")) {
                    str = "高发际线";
                    break;
                }
                str = "未知配置";
                break;
            case 340983459:
                if (config.equals("lowerJawbone")) {
                    str = "瘦下颚骨";
                    break;
                }
                str = "未知配置";
                break;
            case 351608024:
                if (config.equals("version")) {
                    str = "美颜版本 0无美颜 1旧美颜 2 新美颜";
                    break;
                }
                str = "未知配置";
                break;
            case 455311658:
                if (config.equals("cheekBone")) {
                    str = "瘦颧骨";
                    break;
                }
                str = "未知配置";
                break;
            case 951540442:
                if (config.equals("contour")) {
                    str = "五官立体";
                    break;
                }
                str = "未知配置";
                break;
            case 1185487353:
                if (config.equals("girlSlim")) {
                    str = " 瘦脸女神";
                    break;
                }
                str = "未知配置";
                break;
            case 1581412002:
                if (config.equals("teethBright")) {
                    str = "白牙";
                    break;
                }
                str = "未知配置";
                break;
            case 1660656102:
                if (config.equals("chinLong")) {
                    str = "长下巴";
                    break;
                }
                str = "未知配置";
                break;
            case 1672808674:
                if (config.equals("enableBeautify")) {
                    str = "启用美颜";
                    break;
                }
                str = "未知配置";
                break;
            case 1964435585:
                if (config.equals("mouthMorph")) {
                    str = "唇形";
                    break;
                }
                str = "未知配置";
                break;
            case 2054228499:
                if (config.equals("sharpen")) {
                    str = "清晰";
                    break;
                }
                str = "未知配置";
                break;
            case 2063955562:
                if (config.equals("smileFolds")) {
                    str = "祛法令纹";
                    break;
                }
                str = "未知配置";
                break;
            default:
                str = "未知配置";
                break;
        }
        holder.s(com.tencent.mm.R.id.o3b, str);
        ((android.widget.EditText) holder.p(com.tencent.mm.R.id.f484162d74)).setText(java.lang.String.valueOf(item.f176936e));
        ((android.widget.EditText) holder.p(com.tencent.mm.R.id.f484162d74)).addTextChangedListener(new com.tencent.mm.plugin.voip.ui.b());
        ((android.widget.EditText) holder.p(com.tencent.mm.R.id.f484162d74)).setOnEditorActionListener(new com.tencent.mm.plugin.voip.ui.c(this, i17));
    }

    @Override // in5.r
    public void i(androidx.recyclerview.widget.RecyclerView recyclerView, in5.s0 holder, int i17) {
        kotlin.jvm.internal.o.g(recyclerView, "recyclerView");
        kotlin.jvm.internal.o.g(holder, "holder");
    }
}
