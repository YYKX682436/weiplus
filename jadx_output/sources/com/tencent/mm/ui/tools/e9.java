package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class e9 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper f210378d;

    public e9(com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper searchViewNotRealTimeHelper) {
        this.f210378d = searchViewNotRealTimeHelper;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.ui.tools.SearchViewNotRealTimeHelper searchViewNotRealTimeHelper;
        com.tencent.mm.ui.tools.i9 i9Var;
        if (3 != i17 || (i9Var = (searchViewNotRealTimeHelper = this.f210378d).f210147h) == null) {
            return false;
        }
        ((or1.j2) i9Var).a(searchViewNotRealTimeHelper.getSearchContent());
        return true;
    }
}
