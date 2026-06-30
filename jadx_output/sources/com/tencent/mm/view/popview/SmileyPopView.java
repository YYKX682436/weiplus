package com.tencent.mm.view.popview;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/tencent/mm/view/popview/SmileyPopView;", "Lcom/tencent/mm/view/popview/AbstractPopView;", "Lgr/c0;", "item", "Ljz5/f0;", "setSmileyItem", "Landroid/view/WindowManager$LayoutParams;", "getWindowLayoutParams", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "plugin-emojisdk_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes12.dex */
public final class SmileyPopView extends com.tencent.mm.view.popview.AbstractPopView {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f213691f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.ImageView f213692g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f213693h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.gif.u f213694i;

    /* renamed from: m, reason: collision with root package name */
    public final int f213695m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.WindowManager.LayoutParams f213696n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SmileyPopView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        kotlin.jvm.internal.o.g(context, "context");
    }

    @Override // com.tencent.mm.view.popview.AbstractPopView
    public void d(android.view.View anchor) {
        kotlin.jvm.internal.o.g(anchor, "anchor");
        c(anchor.getContext());
        anchor.setPressed(false);
        anchor.setSelected(false);
        int[] iArr = new int[2];
        anchor.getLocationOnScreen(iArr);
        int i17 = getResources().getDisplayMetrics().widthPixels;
        int measuredWidth = iArr[0] + (anchor.getMeasuredWidth() / 2);
        android.view.WindowManager.LayoutParams layoutParams = this.f213696n;
        int i18 = (layoutParams.width - this.f213695m) / 2;
        layoutParams.y = ((iArr[1] - layoutParams.height) + anchor.getMeasuredHeight()) - this.f213672e;
        int i19 = layoutParams.width;
        int i27 = i19 / 2;
        android.view.View view = this.f213691f;
        if (measuredWidth < i27) {
            kotlin.jvm.internal.o.d(view);
            view.setBackground(com.tencent.mm.ui.zk.d(getContext(), com.tencent.mm.R.attr.f478265f5));
            layoutParams.x = (measuredWidth + i18) - (i17 / 2);
        } else if ((i19 / 2) + measuredWidth > i17) {
            kotlin.jvm.internal.o.d(view);
            view.setBackground(com.tencent.mm.ui.zk.d(getContext(), com.tencent.mm.R.attr.f478266f6));
            layoutParams.x = (measuredWidth - i18) - (i17 / 2);
        } else {
            kotlin.jvm.internal.o.d(view);
            view.setBackground(com.tencent.mm.ui.zk.d(getContext(), com.tencent.mm.R.attr.f478264f4));
            layoutParams.x = measuredWidth - (i17 / 2);
        }
    }

    @Override // com.tencent.mm.view.popview.AbstractPopView
    /* renamed from: getWindowLayoutParams, reason: from getter */
    public android.view.WindowManager.LayoutParams getF213696n() {
        return this.f213696n;
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z17) {
        super.onWindowFocusChanged(z17);
        if (z17) {
            return;
        }
        a();
    }

    public final void setSmileyItem(gr.c0 item) {
        java.lang.Object obj;
        java.lang.String str;
        kotlin.jvm.internal.o.g(item, "item");
        com.tencent.mm.smiley.e1 b17 = com.tencent.mm.smiley.e1.b();
        java.lang.String str2 = item.f274663a;
        java.lang.String d17 = b17.d(str2);
        java.lang.String d18 = com.tencent.mm.smiley.g.b().d(d17);
        com.tencent.mars.xlog.Log.i("MicroMsg.SmileyPopView", "pop smiley %s, %s, %s", str2, d17, d18);
        kotlin.jvm.internal.o.d(d18);
        int L = r26.n0.L(d18, "[", 0, false, 6, null);
        int L2 = r26.n0.L(d18, "]", 0, false, 6, null);
        if (L2 == -1) {
            L2 = d18.length();
        }
        java.lang.String substring = d18.substring(L + 1, L2);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        android.widget.TextView textView = this.f213693h;
        if (textView != null) {
            textView.setText(substring);
        }
        xq.r rVar = xq.s.f456015a;
        java.util.Iterator it = xq.s.f456019e.f455977c.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.jvm.internal.o.b(((xq.c) obj).f455971b, str2)) {
                    break;
                }
            }
        }
        xq.c cVar = (xq.c) obj;
        if (cVar == null) {
            str = null;
        } else {
            str = rr.s.f399149a.b() + cVar.f455972c;
        }
        com.tencent.mm.plugin.gif.u uVar = this.f213694i;
        if (uVar != null) {
            uVar.b();
        }
        this.f213694i = null;
        boolean j17 = com.tencent.mm.vfs.w6.j(str);
        android.widget.ImageView imageView = this.f213692g;
        if (j17) {
            try {
                this.f213694i = new com.tencent.mm.plugin.gif.u(com.tencent.mm.vfs.w6.N(str, 0, -1));
            } catch (java.lang.Exception e17) {
                if (e17 instanceof com.tencent.mm.plugin.gif.MMGIFException) {
                    com.tencent.mm.plugin.report.service.g0.INSTANCE.A(711, 22);
                }
            }
            if (imageView != null) {
                imageView.setImageDrawable(this.f213694i);
            }
            com.tencent.mm.plugin.gif.u uVar2 = this.f213694i;
            if (uVar2 != null) {
                uVar2.d();
                return;
            }
            return;
        }
        if (imageView != null) {
            imageView.setImageDrawable(com.tencent.mm.smiley.e1.b().c(str2));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setSmileyItem: ");
        sb6.append(str2);
        sb6.append(", ");
        xq.r rVar2 = xq.s.f456015a;
        sb6.append(xq.s.f456019e.f455977c.size());
        com.tencent.mars.xlog.Log.i("MicroMsg.SmileyPopView", sb6.toString());
        if (cVar != null) {
            rVar2.a();
        }
    }

    public /* synthetic */ SmileyPopView(android.content.Context context, android.util.AttributeSet attributeSet, int i17, int i18, kotlin.jvm.internal.i iVar) {
        this(context, (i18 & 2) != 0 ? null : attributeSet, (i18 & 4) != 0 ? 0 : i17);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmileyPopView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        kotlin.jvm.internal.o.g(context, "context");
        android.view.View.inflate(context, com.tencent.mm.R.layout.a79, this);
        this.f213691f = findViewById(com.tencent.mm.R.id.f486962n11);
        this.f213692g = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.f484206dd5);
        this.f213693h = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f484205dd4);
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams(2, 264, 1);
        this.f213696n = layoutParams;
        this.f213695m = getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.a_9);
        layoutParams.width = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a_8);
        layoutParams.height = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.a_6);
        layoutParams.gravity = 49;
    }
}
