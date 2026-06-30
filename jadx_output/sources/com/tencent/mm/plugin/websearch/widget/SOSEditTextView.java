package com.tencent.mm.plugin.websearch.widget;

/* loaded from: classes8.dex */
public class SOSEditTextView extends com.tencent.mm.ui.search.FTSEditTextView {
    public static boolean T;

    /* renamed from: J, reason: collision with root package name */
    public android.view.View f181706J;
    public android.widget.TextView K;
    public boolean L;
    public android.view.View M;
    public bw4.b N;
    public boolean P;
    public boolean Q;
    public bw4.c R;
    public int S;

    public SOSEditTextView(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.L = false;
        this.P = false;
        this.Q = false;
    }

    @Override // com.tencent.mm.ui.search.FTSEditTextView
    public boolean b() {
        return !this.C && this.f209829w == 2;
    }

    public android.view.View getCancelTextView() {
        return this.K;
    }

    public android.view.View getSearchBarCancelTextContainer() {
        return this.M;
    }

    public int getSearchBarCancelTextContainerMaxWidth() {
        int max = java.lang.Math.max(getSearchBarCancelTextContainer().getMeasuredWidth(), this.S);
        this.S = max;
        return max;
    }

    public android.view.View getVoiceImageButton() {
        return this.f181706J;
    }

    @Override // com.tencent.mm.ui.search.FTSEditTextView
    public void i(int i17) {
        if (T) {
            android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.epp, (android.view.ViewGroup) this, true);
            return;
        }
        int i18 = this.f209829w;
        if (i18 == 0) {
            android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.f489537cv5, (android.view.ViewGroup) this, true);
        } else if (i18 == 1 || i18 == 3) {
            android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.cv6, (android.view.ViewGroup) this, true);
        } else {
            android.view.LayoutInflater.from(getContext()).inflate(com.tencent.mm.R.layout.cv7, (android.view.ViewGroup) this, true);
        }
    }

    @Override // com.tencent.mm.ui.search.FTSEditTextView
    public void j(android.util.AttributeSet attributeSet) {
        super.j(attributeSet);
        this.f181706J = findViewById(com.tencent.mm.R.id.c8l);
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f487274o41);
        this.K = textView;
        textView.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r) * i65.a.m(getContext()));
        this.M = findViewById(com.tencent.mm.R.id.mdc);
        getEditText().setOnFocusChangeListener(null);
        getEditText().setHintTextColor(getResources().getColor(com.tencent.mm.R.color.f479301vh));
        getEditText().setTextColor(getResources().getColor(com.tencent.mm.R.color.a0c));
        if (getIconView() != null) {
            getIconView().setOnClickListener(new bw4.a(this));
        }
        this.S = java.lang.Math.max(getSearchBarCancelTextContainer().getMeasuredWidth(), (int) getResources().getDimension(com.tencent.mm.R.dimen.f479728dk));
    }

    public void setCameraBtnClickListener(android.view.View.OnClickListener onClickListener) {
        android.view.View view = this.f181706J;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public void setCancelBtnForceHide(boolean z17) {
        this.P = z17;
    }

    public void setCancelTextViewCallback(bw4.b bVar) {
        this.N = bVar;
    }

    public void setCancelTextViewClickListener(android.view.View.OnClickListener onClickListener) {
        android.widget.TextView textView = this.K;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
    }

    public void setCancelTextViewVisibile(int i17) {
        android.widget.TextView textView = this.K;
        if (textView != null) {
            textView.setVisibility(i17);
        }
    }

    public void setCancelVisableChangeListener(bw4.c cVar) {
        this.R = cVar;
    }

    public void setCommonRightBtnForceHide(boolean z17) {
        this.Q = z17;
    }

    public void setCommonRightImageButtonVisibile(int i17) {
        if (this.f181706J == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.SOSEditTextView", "setCommonRightImageButtonVisibile, commonRightImageButton is null!");
            return;
        }
        int i18 = 8;
        if (this.L) {
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.SOSEditTextView", "setCommonRightImageButtonVisibile, needForceHideCameraIcon override to GONE");
            i17 = 8;
        }
        if (!this.Q) {
            i18 = i17;
        } else {
            if (this.f181706J.getVisibility() == 8) {
                com.tencent.mars.xlog.Log.i("MicroMsg.FTS.SOSEditTextView", "setCommonRightImageButtonVisibile, commonRightBtnForceHide early return (already GONE)");
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.FTS.SOSEditTextView", "setCommonRightImageButtonVisibile, commonRightBtnForceHide override to GONE");
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.FTS.SOSEditTextView", "setCommonRightImageButtonVisibile, final visibility = %d", java.lang.Integer.valueOf(i18));
        android.view.View view = this.f181706J;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i18));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/websearch/widget/SOSEditTextView", "setCommonRightImageButtonVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/websearch/widget/SOSEditTextView", "setCommonRightImageButtonVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public void setNeedForceHideCameraIcon(boolean z17) {
        this.L = z17;
    }

    public void setSearchBarCancelTextContainerVisibile(int i17) {
        android.view.View view = this.M;
        if (view != null) {
            if (this.P) {
                if (view.getVisibility() == 8) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTS.SOSEditTextView", "cancelBtnForceHide， return");
                    return;
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.FTS.SOSEditTextView", "cancelBtnForceHide， set Gone");
                    i17 = 8;
                }
            }
            android.view.View view2 = this.M;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/websearch/widget/SOSEditTextView", "setSearchBarCancelTextContainerVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/websearch/widget/SOSEditTextView", "setSearchBarCancelTextContainerVisibile", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            bw4.b bVar = this.N;
            if (bVar != null) {
                android.view.View view3 = this.M;
                com.tencent.mm.plugin.webview.ui.tools.fts.BaseSOSWebViewUI baseSOSWebViewUI = ((com.tencent.mm.plugin.webview.ui.tools.fts.q) bVar).f184586a;
                baseSOSWebViewUI.getClass();
                view3.postDelayed(new com.tencent.mm.plugin.webview.ui.tools.fts.w(baseSOSWebViewUI, i17, view3), 0L);
            }
            bw4.c cVar = this.R;
            if (cVar != null) {
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateActionDonePos, visibility = ");
                sb6.append(i17);
                sb6.append("， hasHappenQuery = ");
                com.tencent.mm.plugin.webview.ui.tools.fts.FTSSOSHomeWebViewUI fTSSOSHomeWebViewUI = ((com.tencent.mm.plugin.webview.ui.tools.fts.x1) cVar).f184718a;
                sb6.append(fTSSOSHomeWebViewUI.F5);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.FTSSOSHomeWebViewUI", sb6.toString());
                fTSSOSHomeWebViewUI.Qa();
                if (((fTSSOSHomeWebViewUI.F5 || fTSSOSHomeWebViewUI.T4) ? false : true) || fTSSOSHomeWebViewUI.J4.getSearchBarCancelTextContainer() == null) {
                    return;
                }
                com.tencent.mm.plugin.websearch.widget.SOSEditTextView sOSEditTextView = fTSSOSHomeWebViewUI.J4;
                sOSEditTextView.u(sOSEditTextView.getSearchBarCancelTextContainer().getVisibility() == 0);
            }
        }
    }

    public void setVoiceBtnClickListener(android.view.View.OnClickListener onClickListener) {
        android.view.View view = this.f181706J;
        if (view != null) {
            view.setOnClickListener(onClickListener);
        }
    }

    public SOSEditTextView(android.content.Context context, android.util.AttributeSet attributeSet, int i17) {
        super(context, attributeSet, i17);
        this.L = false;
        this.P = false;
        this.Q = false;
    }
}
