package com.tencent.mm.view;

@kotlin.Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001%B\u0019\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/¢\u0006\u0004\b1\u00102B!\b\u0016\u0012\u0006\u0010.\u001a\u00020-\u0012\u0006\u00100\u001a\u00020/\u0012\u0006\u00103\u001a\u00020\u0004¢\u0006\u0004\b1\u00104J\u0014\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004J\u001a\u0010\u000b\u001a\u00020\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\tJ\u0012\u0010\u000e\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016R\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R.\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR(\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0004\b\u001c\u0010\u001d\u0012\u0004\b\"\u0010#\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010,\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+¨\u00065"}, d2 = {"Lcom/tencent/mm/view/TextModeSelectView;", "Lcom/tencent/mm/ui/MMImageView;", "Landroid/view/View$OnClickListener;", "", "", "modes", "Ljz5/f0;", "setMode", "newMode", "", "map", "setModeResourceMap", "Landroid/view/View;", org.chromium.base.BaseSwitches.V, "onClick", "", "d", "Ljava/util/List;", "getModeList", "()Ljava/util/List;", "modeList", "e", "Ljava/util/Map;", "getModeResource", "()Ljava/util/Map;", "setModeResource", "(Ljava/util/Map;)V", "modeResource", "f", "I", "getCurMode", "()I", "setCurMode", "(I)V", "getCurMode$annotations", "()V", "curMode", "Lym5/g6;", "g", "Lym5/g6;", "getModeChangeListener", "()Lym5/g6;", "setModeChangeListener", "(Lym5/g6;)V", "modeChangeListener", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-photoedit-sdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public final class TextModeSelectView extends com.tencent.mm.ui.MMImageView implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public final java.util.List modeList;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public java.util.Map modeResource;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    public int curMode;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public ym5.g6 modeChangeListener;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextModeSelectView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        java.util.List k17 = kz5.c0.k(1, 3);
        this.modeList = k17;
        this.modeResource = kz5.c1.k(new jz5.l(1, java.lang.Integer.valueOf(com.tencent.mm.R.raw.text_bg_unselected)), new jz5.l(2, java.lang.Integer.valueOf(com.tencent.mm.R.raw.text_selected)), new jz5.l(3, java.lang.Integer.valueOf(com.tencent.mm.R.raw.text_bg_selected)));
        this.curMode = 1;
        this.curMode = ((java.lang.Number) kz5.n0.X(k17)).intValue();
        a();
        setOnClickListener(this);
    }

    public static /* synthetic */ void getCurMode$annotations() {
    }

    public final void a() {
        java.lang.Integer num = (java.lang.Integer) this.modeResource.get(java.lang.Integer.valueOf(this.curMode));
        setImageResource((num == null && (num = (java.lang.Integer) this.modeResource.get(1)) == null) ? com.tencent.mm.R.raw.text_bg_unselected : num.intValue());
    }

    public final int getCurMode() {
        return this.curMode;
    }

    public final ym5.g6 getModeChangeListener() {
        return this.modeChangeListener;
    }

    public final java.util.List<java.lang.Integer> getModeList() {
        return this.modeList;
    }

    public final java.util.Map<java.lang.Integer, java.lang.Integer> getModeResource() {
        return this.modeResource;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/view/TextModeSelectView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        java.util.List list = this.modeList;
        setMode(((java.lang.Number) list.get((list.indexOf(java.lang.Integer.valueOf(this.curMode)) + 1) % list.size())).intValue());
        yj0.a.h(this, "com/tencent/mm/view/TextModeSelectView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public final void setCurMode(int i17) {
        this.curMode = i17;
    }

    public final void setMode(java.util.List<java.lang.Integer> modes) {
        kotlin.jvm.internal.o.g(modes, "modes");
        java.util.List list = this.modeList;
        list.clear();
        list.addAll(modes);
        setMode(((java.lang.Number) kz5.n0.X(list)).intValue());
    }

    public final void setModeChangeListener(ym5.g6 g6Var) {
        this.modeChangeListener = g6Var;
    }

    public final void setModeResource(java.util.Map<java.lang.Integer, java.lang.Integer> map) {
        kotlin.jvm.internal.o.g(map, "<set-?>");
        this.modeResource = map;
    }

    public final void setModeResourceMap(java.util.Map<java.lang.Integer, java.lang.Integer> map) {
        kotlin.jvm.internal.o.g(map, "map");
        this.modeResource = map;
        a();
    }

    public final void setMode(int i17) {
        if (this.curMode == i17) {
            return;
        }
        this.curMode = i17;
        a();
        ym5.g6 g6Var = this.modeChangeListener;
        if (g6Var != null) {
            g6Var.a(i17);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextModeSelectView(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(attrs, "attrs");
        java.util.List k17 = kz5.c0.k(1, 3);
        this.modeList = k17;
        this.modeResource = kz5.c1.k(new jz5.l(1, java.lang.Integer.valueOf(com.tencent.mm.R.raw.text_bg_unselected)), new jz5.l(2, java.lang.Integer.valueOf(com.tencent.mm.R.raw.text_selected)), new jz5.l(3, java.lang.Integer.valueOf(com.tencent.mm.R.raw.text_bg_selected)));
        this.curMode = 1;
        this.curMode = ((java.lang.Number) kz5.n0.X(k17)).intValue();
        a();
        setOnClickListener(this);
    }
}
