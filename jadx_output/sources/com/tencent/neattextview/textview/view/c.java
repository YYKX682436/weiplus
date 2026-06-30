package com.tencent.neattextview.textview.view;

/* loaded from: classes15.dex */
public class c implements ks5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.neattextview.textview.view.NeatTextView f215199a;

    public c(com.tencent.neattextview.textview.view.NeatTextView neatTextView) {
        this.f215199a = neatTextView;
    }

    @Override // ks5.a
    public int a(int i17) {
        android.text.Layout wrappedTxtLayout;
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = this.f215199a;
        if (neatTextView.f215178e) {
            wrappedTxtLayout = neatTextView.getWrappedTxtLayout();
            if (wrappedTxtLayout == null) {
                return -1;
            }
            return wrappedTxtLayout.getLineTop(i17);
        }
        ks5.c cVar = neatTextView.f215177d;
        if (cVar == null) {
            return -1;
        }
        return cVar.a(i17);
    }

    @Override // ks5.a
    public int b(int i17) {
        android.text.Layout wrappedTxtLayout;
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = this.f215199a;
        if (neatTextView.f215178e) {
            wrappedTxtLayout = neatTextView.getWrappedTxtLayout();
            if (wrappedTxtLayout == null) {
                return -1;
            }
            return wrappedTxtLayout.getLineStart(i17);
        }
        ks5.c cVar = neatTextView.f215177d;
        if (cVar == null) {
            return -1;
        }
        return cVar.b(i17);
    }

    @Override // ks5.a
    public int c(int i17) {
        android.text.Layout wrappedTxtLayout;
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = this.f215199a;
        if (neatTextView.f215178e) {
            wrappedTxtLayout = neatTextView.getWrappedTxtLayout();
            if (wrappedTxtLayout == null) {
                return -1;
            }
            return wrappedTxtLayout.getLineBaseline(i17);
        }
        ks5.c cVar = neatTextView.f215177d;
        if (cVar == null) {
            return -1;
        }
        return cVar.c(i17);
    }

    @Override // ks5.a
    public int d() {
        android.text.Layout wrappedTxtLayout;
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = this.f215199a;
        if (neatTextView.f215178e) {
            wrappedTxtLayout = neatTextView.getWrappedTxtLayout();
            if (wrappedTxtLayout == null) {
                return -1;
            }
            return wrappedTxtLayout.getLineCount();
        }
        ks5.c cVar = neatTextView.f215177d;
        if (cVar == null) {
            return -1;
        }
        return cVar.f311814j.size();
    }

    @Override // ks5.a
    public int e(int i17) {
        android.text.Layout wrappedTxtLayout;
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = this.f215199a;
        if (neatTextView.f215178e) {
            wrappedTxtLayout = neatTextView.getWrappedTxtLayout();
            if (wrappedTxtLayout == null) {
                return -1;
            }
            return wrappedTxtLayout.getLineBottom(i17);
        }
        ks5.c cVar = neatTextView.f215177d;
        if (cVar == null) {
            return -1;
        }
        return cVar.e(i17);
    }

    @Override // ks5.a
    public float f(int i17) {
        android.text.Layout wrappedTxtLayout;
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = this.f215199a;
        if (neatTextView.f215178e) {
            wrappedTxtLayout = neatTextView.getWrappedTxtLayout();
            if (wrappedTxtLayout == null) {
                return -1.0f;
            }
            return wrappedTxtLayout.getPrimaryHorizontal(i17);
        }
        ks5.c cVar = neatTextView.f215177d;
        if (cVar == null) {
            return -1.0f;
        }
        return cVar.f(i17);
    }

    @Override // ks5.a
    public int g(int i17, float f17) {
        android.text.Layout wrappedTxtLayout;
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = this.f215199a;
        if (neatTextView.f215178e) {
            wrappedTxtLayout = neatTextView.getWrappedTxtLayout();
            if (wrappedTxtLayout == null) {
                return -1;
            }
            return wrappedTxtLayout.getOffsetForHorizontal(i17, f17);
        }
        ks5.c cVar = neatTextView.f215177d;
        if (cVar == null) {
            return -1;
        }
        return cVar.g(i17, f17);
    }

    @Override // ks5.a
    public int h(int i17) {
        android.text.Layout wrappedTxtLayout;
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = this.f215199a;
        if (neatTextView.f215178e) {
            wrappedTxtLayout = neatTextView.getWrappedTxtLayout();
            if (wrappedTxtLayout == null) {
                return -1;
            }
            return wrappedTxtLayout.getLineForVertical(i17);
        }
        ks5.c cVar = neatTextView.f215177d;
        if (cVar == null) {
            return -1;
        }
        return cVar.h(i17);
    }

    @Override // ks5.a
    public float i(int i17) {
        android.text.Layout wrappedTxtLayout;
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = this.f215199a;
        if (neatTextView.f215178e) {
            wrappedTxtLayout = neatTextView.getWrappedTxtLayout();
            if (wrappedTxtLayout == null) {
                return -1.0f;
            }
            return wrappedTxtLayout.getLineRight(i17);
        }
        ks5.c cVar = neatTextView.f215177d;
        if (cVar == null) {
            return -1.0f;
        }
        return cVar.i(i17);
    }

    @Override // ks5.a
    public int j(int i17) {
        android.text.Layout wrappedTxtLayout;
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = this.f215199a;
        if (neatTextView.f215178e) {
            wrappedTxtLayout = neatTextView.getWrappedTxtLayout();
            if (wrappedTxtLayout == null) {
                return -1;
            }
            return wrappedTxtLayout.getEllipsisStart(i17);
        }
        ks5.c cVar = neatTextView.f215177d;
        if (cVar == null) {
            return -1;
        }
        return cVar.j(i17);
    }

    @Override // ks5.a
    public int k(int i17, int i18) {
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = this.f215199a;
        if (!neatTextView.f215178e) {
            ks5.c cVar = neatTextView.f215177d;
            if (cVar == null) {
                return -1;
            }
            return cVar.k(i17, i18);
        }
        int paddingLeft = i17 - neatTextView.getPaddingLeft();
        int paddingTop = i18 - neatTextView.getPaddingTop();
        android.text.Layout layout = neatTextView.getWrappedTextView().getLayout();
        if (layout == null) {
            return -1;
        }
        int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(paddingTop), paddingLeft);
        return ((int) layout.getPrimaryHorizontal(offsetForHorizontal)) > paddingLeft ? layout.getOffsetToLeftOf(offsetForHorizontal) : offsetForHorizontal;
    }

    @Override // ks5.a
    public int l(int i17) {
        android.text.Layout wrappedTxtLayout;
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = this.f215199a;
        if (neatTextView.f215178e) {
            wrappedTxtLayout = neatTextView.getWrappedTxtLayout();
            if (wrappedTxtLayout == null) {
                return -1;
            }
            return wrappedTxtLayout.getEllipsisCount(i17);
        }
        ks5.c cVar = neatTextView.f215177d;
        if (cVar == null) {
            return -1;
        }
        return cVar.l(i17);
    }

    @Override // ks5.a
    public java.util.List m() {
        ks5.c cVar;
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = this.f215199a;
        if (neatTextView.f215178e || (cVar = neatTextView.f215177d) == null) {
            return null;
        }
        return cVar.m();
    }

    @Override // ks5.a
    public int n(int i17) {
        android.text.Layout wrappedTxtLayout;
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = this.f215199a;
        if (neatTextView.f215178e) {
            wrappedTxtLayout = neatTextView.getWrappedTxtLayout();
            if (wrappedTxtLayout == null) {
                return 0;
            }
            return wrappedTxtLayout.getLineForOffset(i17);
        }
        ks5.c cVar = neatTextView.f215177d;
        if (cVar == null) {
            return 0;
        }
        return cVar.n(i17);
    }

    @Override // ks5.a
    public float o(int i17) {
        android.text.Layout wrappedTxtLayout;
        com.tencent.neattextview.textview.view.NeatTextView neatTextView = this.f215199a;
        if (neatTextView.f215178e) {
            wrappedTxtLayout = neatTextView.getWrappedTxtLayout();
            if (wrappedTxtLayout == null) {
                return -1.0f;
            }
            return wrappedTxtLayout.getLineWidth(i17);
        }
        ks5.c cVar = neatTextView.f215177d;
        if (cVar == null) {
            return -1.0f;
        }
        return cVar.o(i17);
    }
}
