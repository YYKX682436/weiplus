package com.tencent.mm.pluginsdk.ui.span;

/* loaded from: classes4.dex */
public class z0 extends android.text.style.ClickableSpan implements gb5.a {
    private static final java.lang.String TAG = "MicroMsg.PressableClickSpan";
    private byte _hellAccFlag_;
    private boolean boldClickSpan;
    private boolean isPressed;
    private com.tencent.mm.pluginsdk.ui.span.a mAdTagClickCallback;
    private int mAdTagClickScene;
    private int mBgColor;
    protected com.tencent.mm.pluginsdk.ui.span.a0 mClickListener;
    private boolean mEnable;
    private r35.m3 mHrefInfo;
    private int mLinkColor;
    private java.lang.String mSessionId;
    private com.tencent.mm.pluginsdk.ui.span.a1 mSpanClickCallback;
    private java.lang.ref.WeakReference<android.view.View> mViewRef;
    private boolean needDealOverflowOffset;
    private int position;
    private java.lang.Object tag;
    private android.content.Context uiContext;

    public z0() {
        this.isPressed = false;
        this.boldClickSpan = false;
        this.mClickListener = null;
        this.mHrefInfo = null;
        this.mEnable = true;
        this.mViewRef = null;
        this.uiContext = null;
        this.tag = null;
        this.needDealOverflowOffset = true;
    }

    public int getBgColor() {
        return this.mBgColor;
    }

    public r35.m3 getHrefInfo() {
        return this.mHrefInfo;
    }

    public boolean getNeedDealOverflowOffset() {
        return this.needDealOverflowOffset;
    }

    public boolean getPress() {
        return this.isPressed;
    }

    public java.lang.Object getTag() {
        return this.tag;
    }

    public int getType() {
        r35.m3 m3Var = this.mHrefInfo;
        if (m3Var == null) {
            return Integer.MAX_VALUE;
        }
        return m3Var.f369195d;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.pluginsdk.ui.span.a0 a0Var = this.mClickListener;
        if (a0Var != null && this.mHrefInfo != null && this.mEnable) {
            android.content.Context context = this.uiContext;
            if (context == null) {
                context = view.getContext();
            }
            a0Var.f191163a = context;
            this.mClickListener.a(view, this.mHrefInfo);
            this.mClickListener.f191163a = null;
            com.tencent.mm.pluginsdk.ui.span.a1 a1Var = this.mSpanClickCallback;
            if (a1Var != null && view != null) {
                a1Var.a(view, this.mHrefInfo.f369194c);
            }
        }
        com.tencent.mm.pluginsdk.ui.span.a aVar = this.mAdTagClickCallback;
        if (aVar != null) {
            aVar.a(this.position, this.mAdTagClickScene);
        }
        yj0.a.h(this, "com/tencent/mm/pluginsdk/ui/span/PressableClickSpan", "android/text/style/ClickableSpan", "onClick", "(Landroid/view/View;)V");
    }

    public void setAdTagClickCallback(com.tencent.mm.pluginsdk.ui.span.a aVar, int i17) {
        this.mAdTagClickCallback = aVar;
        this.position = i17;
    }

    public void setAdTagClickScene(int i17) {
        this.mAdTagClickScene = i17;
    }

    public void setColor(int i17, int i18) {
        this.mLinkColor = i17;
        this.mBgColor = i18;
    }

    public void setColorConfig(int i17) {
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        if (i17 == 1) {
            setColor(context.getResources().getColor(com.tencent.mm.R.color.f478812hx), context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1));
            return;
        }
        if (i17 == 2) {
            setColor(context.getResources().getColor(com.tencent.mm.R.color.f478734fp), context.getResources().getColor(com.tencent.mm.R.color.f479514a61));
            return;
        }
        if (i17 == 3) {
            setColor(context.getResources().getColor(com.tencent.mm.R.color.a69), context.getResources().getColor(com.tencent.mm.R.color.f479514a61));
        } else if (i17 == 4) {
            setColor(context.getResources().getColor(com.tencent.mm.R.color.f478811hw), context.getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1));
        } else {
            if (i17 != 5) {
                return;
            }
            setColor(context.getResources().getColor(com.tencent.mm.R.color.f479481a30), context.getResources().getColor(com.tencent.mm.R.color.f479514a61));
        }
    }

    public void setContext(android.content.Context context) {
        this.uiContext = context;
        com.tencent.mm.pluginsdk.ui.span.a0 a0Var = this.mClickListener;
        if (a0Var != null) {
            a0Var.f191163a = context;
        }
    }

    public void setEnable(boolean z17) {
        this.mEnable = z17;
    }

    @Override // gb5.a
    public void setIsPressed(boolean z17) {
        this.isPressed = z17;
    }

    public void setNeedDealOverflowOffset(boolean z17) {
        this.needDealOverflowOffset = z17;
    }

    public void setSessionId(java.lang.String str) {
        this.mSessionId = str;
        com.tencent.mm.pluginsdk.ui.span.a0 a0Var = this.mClickListener;
        if (a0Var != null) {
            a0Var.f191164b = str;
        }
    }

    public void setSpanClickCallback(com.tencent.mm.pluginsdk.ui.span.a1 a1Var) {
        this.mSpanClickCallback = a1Var;
    }

    public void setTag(java.lang.Object obj) {
        this.tag = obj;
    }

    public void setTextBold(boolean z17) {
        this.boldClickSpan = z17;
    }

    @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
    public void updateDrawState(android.text.TextPaint textPaint) {
        com.tencent.mars.xlog.Log.getLogLevel();
        super.updateDrawState(textPaint);
        textPaint.setColor(this.mLinkColor);
        textPaint.setUnderlineText(false);
        textPaint.linkColor = this.mLinkColor;
        if (getPress()) {
            textPaint.bgColor = this.mBgColor;
        } else {
            textPaint.bgColor = 0;
        }
    }

    public z0(int i17, r35.m3 m3Var) {
        int i18;
        int i19 = 0;
        this.isPressed = false;
        this.boldClickSpan = false;
        this.mClickListener = null;
        this.mHrefInfo = null;
        this.mEnable = true;
        this.mViewRef = null;
        this.uiContext = null;
        this.tag = null;
        this.needDealOverflowOffset = true;
        if (m3Var != null) {
            i19 = m3Var.f369202k;
            i18 = m3Var.f369203l;
        } else {
            i18 = 0;
        }
        if (i19 == 0 && i18 == 0) {
            setColorConfig(i17);
        } else {
            setColor(i19, i18);
        }
        this.mClickListener = new com.tencent.mm.pluginsdk.ui.span.a0();
        this.mHrefInfo = m3Var;
    }

    public z0(int i17, int i18) {
        this.isPressed = false;
        this.boldClickSpan = false;
        this.mClickListener = null;
        this.mHrefInfo = null;
        this.mEnable = true;
        this.mViewRef = null;
        this.uiContext = null;
        this.tag = null;
        this.needDealOverflowOffset = true;
        setColor(i17, i18);
        this.mClickListener = new com.tencent.mm.pluginsdk.ui.span.a0();
    }
}
