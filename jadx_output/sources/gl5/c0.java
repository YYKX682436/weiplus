package gl5;

/* loaded from: classes15.dex */
public class c0 extends android.view.ActionMode.Callback2 {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f272918c;

    /* renamed from: d, reason: collision with root package name */
    public final int f272919d;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gl5.e0 f272921f;

    /* renamed from: a, reason: collision with root package name */
    public final android.graphics.Path f272916a = new android.graphics.Path();

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.RectF f272917b = new android.graphics.RectF();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Map f272920e = new java.util.HashMap();

    public c0(gl5.e0 e0Var, int i17) {
        this.f272921f = e0Var;
        boolean z17 = i17 == 0 || (e0Var.f272966x && i17 == 2);
        this.f272918c = z17;
        if (z17) {
            gl5.b0 p17 = e0Var.p();
            if (p17.f272903d == null) {
                e0Var.w(false);
                p17.d();
                p17.c();
            }
            this.f272919d = java.lang.Math.max(e0Var.G.getMinimumHeight(), e0Var.H.getMinimumHeight());
            return;
        }
        gl5.w k17 = e0Var.k();
        if (k17 == null) {
            this.f272919d = 0;
        } else {
            k17.b();
            this.f272919d = e0Var.I.getMinimumHeight();
        }
    }

    public final void a(android.view.Menu menu) {
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = this.f272921f.U;
        boolean z17 = (!customTextView.z() || (customTextView.H instanceof android.text.method.PasswordTransformationMethod) || (customTextView.getSelectionStart() == 0 && customTextView.getSelectionEnd() == customTextView.A.length())) ? false : true;
        boolean z18 = menu.findItem(android.R.id.selectAll) != null;
        if (z17 && !z18) {
            menu.add(0, android.R.id.selectAll, 8, android.R.string.selectAll).setShowAsAction(1);
        } else {
            if (z17 || !z18) {
                return;
            }
            menu.removeItem(android.R.id.selectAll);
        }
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(android.view.ActionMode actionMode, android.view.MenuItem menuItem) {
        gl5.e0 e0Var = this.f272921f;
        gl5.e1 o17 = e0Var.o();
        menuItem.getItemId();
        menuItem.getTitle().toString();
        o17.getClass();
        android.view.ActionMode.Callback callback = this.f272918c ? e0Var.K : e0Var.L;
        if (callback != null && callback.onActionItemClicked(actionMode, menuItem)) {
            return true;
        }
        if (menuItem.getGroupId() != 16908353) {
            return e0Var.U.c0(menuItem.getItemId());
        }
        if (!(menuItem.getGroupId() == 16908353)) {
            throw new java.lang.IllegalArgumentException();
        }
        e0Var.o().getClass();
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        ((java.util.HashMap) this.f272920e).clear();
        actionMode.setTitle((java.lang.CharSequence) null);
        actionMode.setSubtitle((java.lang.CharSequence) null);
        actionMode.setTitleOptionalHint(true);
        gl5.e0 e0Var = this.f272921f;
        if (e0Var.U.x()) {
            menu.add(0, android.R.id.cut, 4, android.R.string.cut).setAlphabeticShortcut('x').setShowAsAction(2);
        }
        com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = e0Var.U;
        if (customTextView.w()) {
            menu.add(0, android.R.id.copy, 5, android.R.string.copy).setAlphabeticShortcut('c').setShowAsAction(2);
        }
        if (customTextView.y()) {
            menu.add(0, android.R.id.paste, 6, android.R.string.paste).setAlphabeticShortcut('v').setShowAsAction(2);
        }
        a(menu);
        boolean z17 = this.f272918c;
        android.view.ActionMode.Callback callback = z17 ? e0Var.K : e0Var.L;
        if (callback != null && !callback.onCreateActionMode(actionMode, menu)) {
            android.text.Selection.setSelection((android.text.Spannable) customTextView.getText(), customTextView.getSelectionEnd());
            return false;
        }
        if (z17 && !customTextView.hasTransientState()) {
            customTextView.setHasTransientState(true);
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(android.view.ActionMode actionMode) {
        gl5.e0 e0Var = this.f272921f;
        e0Var.o().getClass();
        e0Var.f272945c = null;
        android.view.ActionMode.Callback callback = this.f272918c ? e0Var.K : e0Var.L;
        if (callback != null) {
            callback.onDestroyActionMode(actionMode);
        }
        if (!e0Var.A) {
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = e0Var.U;
            android.text.Selection.setSelection((android.text.Spannable) customTextView.getText(), customTextView.getSelectionEnd());
        }
        gl5.b0 b0Var = e0Var.f272944b;
        if (b0Var != null) {
            b0Var.c();
        }
        ((java.util.HashMap) this.f272920e).clear();
        e0Var.C = false;
    }

    @Override // android.view.ActionMode.Callback2
    public void onGetContentRect(android.view.ActionMode actionMode, android.view.View view, android.graphics.Rect rect) {
        com.tencent.mars.xlog.Log.i("cmEdit.Editor", "onGetContentRect mode:" + actionMode + ",view:" + view + ",outRect:" + rect);
        gl5.e0 e0Var = this.f272921f;
        if (view.equals(e0Var.U)) {
            com.tencent.mm.ui.widget.cedit.edit.CustomTextView customTextView = e0Var.U;
            if (customTextView.getLayout() != null) {
                int selectionStart = customTextView.getSelectionStart();
                int selectionEnd = customTextView.getSelectionEnd();
                android.graphics.RectF rectF = this.f272917b;
                int i17 = this.f272919d;
                if (selectionStart != selectionEnd) {
                    android.graphics.Path path = this.f272916a;
                    path.reset();
                    customTextView.getLayout().getSelectionPath(customTextView.getSelectionStart(), customTextView.getSelectionEnd(), path);
                    path.computeBounds(rectF, true);
                    rectF.bottom += i17;
                } else {
                    android.text.Layout layout = customTextView.getLayout();
                    int lineForOffset = layout.getLineForOffset(customTextView.getSelectionStart());
                    float c17 = e0Var.c(null, layout.getPrimaryHorizontal(customTextView.getSelectionStart()));
                    rectF.set(c17, layout.getLineTop(lineForOffset), c17, layout.getLineBottom(lineForOffset) + i17);
                }
                float compoundPaddingLeft = customTextView.getCompoundPaddingLeft() - customTextView.getScrollX();
                float y07 = customTextView.y0();
                rect.set((int) java.lang.Math.floor(rectF.left + compoundPaddingLeft), (int) java.lang.Math.floor(rectF.top + y07), (int) java.lang.Math.ceil(rectF.right + compoundPaddingLeft), (int) java.lang.Math.ceil(rectF.bottom + y07));
                return;
            }
        }
        super.onGetContentRect(actionMode, view, rect);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(android.view.ActionMode actionMode, android.view.Menu menu) {
        a(menu);
        boolean z17 = this.f272918c;
        gl5.e0 e0Var = this.f272921f;
        android.view.ActionMode.Callback callback = z17 ? e0Var.K : e0Var.L;
        if (callback != null) {
            return callback.onPrepareActionMode(actionMode, menu);
        }
        return true;
    }
}
