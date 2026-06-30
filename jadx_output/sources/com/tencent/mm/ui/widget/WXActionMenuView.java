package com.tencent.mm.ui.widget;

/* loaded from: classes8.dex */
public class WXActionMenuView extends android.widget.RelativeLayout implements android.view.View.OnClickListener {

    /* renamed from: q, reason: collision with root package name */
    public static final /* synthetic */ int f211486q = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f211487d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f211488e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f211489f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.MenuItem f211490g;

    /* renamed from: h, reason: collision with root package name */
    public android.graphics.drawable.Drawable f211491h;

    /* renamed from: i, reason: collision with root package name */
    public int f211492i;

    /* renamed from: m, reason: collision with root package name */
    public al5.p4 f211493m;

    /* renamed from: n, reason: collision with root package name */
    public android.app.Activity f211494n;

    /* renamed from: o, reason: collision with root package name */
    public final float f211495o;

    /* renamed from: p, reason: collision with root package name */
    public al5.o4 f211496p;

    public WXActionMenuView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private int getShowAsAction() {
        try {
            java.lang.reflect.Field declaredField = this.f211490g.getClass().getDeclaredField("mShowAsAction");
            declaredField.setAccessible(true);
            return ((java.lang.Integer) declaredField.get(this.f211490g)).intValue();
        } catch (java.lang.Exception unused) {
            return 2;
        }
    }

    private void setMenuBackgroundColor(int i17) {
        android.view.View view = this.f211489f;
        if (view != null) {
            view.setBackgroundColor(i17);
        }
    }

    private void setMenuBackgroundDrawble(android.graphics.drawable.Drawable drawable) {
        android.view.View view = this.f211489f;
        if (view == null || drawable == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
    }

    public final void a(android.app.Activity activity, android.view.MenuItem menuItem, al5.o4 o4Var, al5.p4 p4Var) {
        android.widget.TextView textView;
        android.widget.ImageView imageView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.ImageView imageView2;
        this.f211494n = activity;
        this.f211493m = p4Var;
        this.f211496p = o4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.WXActionMenuView", "buildMMActionMenuView, menuCustomParam: %s.", o4Var);
        com.tencent.mars.xlog.Log.i("MicroMsg.WXActionMenuView", "initialize : itemData: %s.", menuItem);
        this.f211490g = menuItem;
        this.f211496p.getClass();
        this.f211492i = (int) ((32 * this.f211495o) + 0.5f);
        this.f211496p.getClass();
        setMenuBackgroundColor(0);
        this.f211496p.getClass();
        setMenuBackgroundDrawble(null);
        this.f211496p.getClass();
        setMenuTitleTextColor(-1);
        this.f211496p.getClass();
        setMenuTitleTextSize(-1.0f);
        this.f211496p.getClass();
        this.f211496p.getClass();
        setIcon(menuItem.getIcon());
        setTitle(menuItem.getTitle());
        setId(menuItem.getItemId());
        setVisibility(menuItem.isVisible() ? 0 : 8);
        setEnabled(menuItem.isEnabled());
        menuItem.hasSubMenu();
        if (this.f211490g == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction, mItemData is null");
            return;
        }
        android.view.View view = this.f211489f;
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/widget/WXActionMenuView", "adapterMenuShowAsAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/widget/WXActionMenuView", "adapterMenuShowAsAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        int showAsAction = getShowAsAction();
        com.tencent.mars.xlog.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction, showAsAction: %s.", java.lang.Integer.valueOf(showAsAction));
        if ((showAsAction & 2) == 2 || (showAsAction & 1) == 1 || (showAsAction & 8) == 8) {
            if (this.f211490g.getIcon() != null && (imageView = this.f211488e) != null) {
                imageView.setVisibility(0);
                android.widget.TextView textView4 = this.f211487d;
                if (textView4 != null) {
                    textView4.setVisibility(8);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is menuTitle gone, menuIcon show.");
                return;
            }
            if (this.f211490g.getTitle() != null && (textView = this.f211487d) != null) {
                textView.setVisibility(0);
                android.widget.ImageView imageView3 = this.f211488e;
                if (imageView3 != null) {
                    imageView3.setVisibility(8);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is menuTitle show, menuIcon gone.");
                return;
            }
            android.widget.ImageView imageView4 = this.f211488e;
            if (imageView4 != null) {
                imageView4.setVisibility(8);
            }
            android.widget.TextView textView5 = this.f211487d;
            if (textView5 != null) {
                textView5.setVisibility(8);
            }
            android.view.View view2 = this.f211489f;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/ui/widget/WXActionMenuView", "adapterMenuShowAsAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/ui/widget/WXActionMenuView", "adapterMenuShowAsAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is all gone");
            return;
        }
        if ((showAsAction & 4) == 4 || (showAsAction & 0) == 0) {
            android.widget.ImageView imageView5 = this.f211488e;
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            if (this.f211490g.getTitle() != null && (textView2 = this.f211487d) != null) {
                textView2.setVisibility(0);
                android.widget.ImageView imageView6 = this.f211488e;
                if (imageView6 != null) {
                    imageView6.setVisibility(8);
                }
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is menuTitle show, menuIcon gone.");
            return;
        }
        if (this.f211490g.getIcon() != null && (imageView2 = this.f211488e) != null) {
            imageView2.setVisibility(0);
            android.widget.TextView textView6 = this.f211487d;
            if (textView6 != null) {
                textView6.setVisibility(8);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is menuTitle gone, menuIcon show.");
            return;
        }
        if (this.f211490g.getTitle() != null && (textView3 = this.f211487d) != null) {
            textView3.setVisibility(0);
            android.widget.ImageView imageView7 = this.f211488e;
            if (imageView7 != null) {
                imageView7.setVisibility(8);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is menuTitle show, menuIcon gone.");
            return;
        }
        android.widget.ImageView imageView8 = this.f211488e;
        if (imageView8 != null) {
            imageView8.setVisibility(8);
        }
        android.widget.TextView textView7 = this.f211487d;
        if (textView7 != null) {
            textView7.setVisibility(8);
        }
        android.view.View view3 = this.f211489f;
        if (view3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/ui/widget/WXActionMenuView", "adapterMenuShowAsAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/ui/widget/WXActionMenuView", "adapterMenuShowAsAction", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WXActionMenuView", "adapterMenuShowAsAction is all gone");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        al5.p4 p4Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/widget/WXActionMenuView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view == this.f211489f && (p4Var = this.f211493m) != null) {
            p4Var.a(this.f211494n, this.f211490g);
        }
        yj0.a.h(this, "com/tencent/mm/ui/widget/WXActionMenuView", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }

    public void setIcon(android.graphics.drawable.Drawable drawable) {
        this.f211491h = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i17 = this.f211492i;
            if (intrinsicWidth > i17) {
                intrinsicHeight = (int) (intrinsicHeight * (i17 / intrinsicWidth));
                intrinsicWidth = i17;
            }
            if (intrinsicHeight > i17) {
                intrinsicWidth = (int) (intrinsicWidth * (i17 / intrinsicHeight));
            } else {
                i17 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i17);
        }
        setMenuIcon(drawable);
    }

    public void setMenuIcon(android.graphics.drawable.Drawable drawable) {
        android.widget.ImageView imageView = this.f211488e;
        if (imageView != null) {
            imageView.setImageDrawable(drawable);
        }
    }

    public void setMenuTitleText(java.lang.CharSequence charSequence) {
        android.widget.TextView textView = this.f211487d;
        if (textView != null) {
            textView.setText(charSequence);
            this.f211487d.setContentDescription(charSequence);
        }
        if (com.tencent.mm.sdk.platformtools.t8.J0(charSequence) || com.tencent.mm.sdk.platformtools.t8.K0(charSequence.toString()) || charSequence.toString().contains(getContext().getResources().getString(com.tencent.mm.R.string.f490929ba5))) {
            return;
        }
        this.f211488e.setContentDescription(((java.lang.Object) charSequence) + getContext().getResources().getString(com.tencent.mm.R.string.f490929ba5));
    }

    public void setMenuTitleTextColor(int i17) {
        android.widget.TextView textView = this.f211487d;
        if (textView == null || i17 <= 0) {
            return;
        }
        textView.setTextColor(i17);
    }

    public void setMenuTitleTextSize(float f17) {
        android.widget.TextView textView = this.f211487d;
        if (textView == null || f17 <= 0.0f) {
            return;
        }
        textView.setTextSize(f17);
    }

    public void setTitle(java.lang.CharSequence charSequence) {
        setMenuTitleText(charSequence);
    }

    public WXActionMenuView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet);
        this.f211487d = null;
        this.f211488e = null;
        float f17 = context.getResources().getDisplayMetrics().density;
        this.f211495o = f17;
        this.f211492i = (int) ((f17 * 32.0f) + 0.5f);
        com.tencent.mars.xlog.Log.i("MicroMsg.WXActionMenuView", "mMaxIconSize : %s, mDefaultNormalActionbarHeight: %s.", java.lang.Integer.valueOf(this.f211492i), java.lang.Integer.valueOf(fp.a.b((android.app.Activity) context, (int) context.getResources().getDimension(context.getResources().getConfiguration().orientation == 2 ? com.tencent.mm.R.dimen.f479622ax : com.tencent.mm.R.dimen.f479623ay))));
        setOnClickListener(this);
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f487911bd, this);
        this.f211489f = inflate;
        if (inflate.getLayoutParams() != null) {
            this.f211489f.getLayoutParams().width = -2;
            this.f211489f.getLayoutParams().height = -1;
        } else {
            this.f211489f.setLayoutParams(new android.widget.RelativeLayout.LayoutParams(-2, -1));
        }
        this.f211487d = (android.widget.TextView) findViewById(com.tencent.mm.R.id.jgj);
        this.f211488e = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.jgr);
        com.tencent.mm.ui.f.b(this.f211487d, com.tencent.mm.R.dimen.f479559b);
    }
}
