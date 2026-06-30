package com.tencent.mm.ui.widget.dialog;

/* loaded from: classes13.dex */
public class k2 extends android.app.Dialog {
    private static final java.lang.String TAG = "MicroMsg.MMDialog";
    private com.tencent.mm.ui.widget.dialog.l iOnDialogDismissListener;
    private java.lang.Runnable mHijackDismissAction;
    private final java.lang.Runnable mReplaceRunnable;

    public k2(android.content.Context context) {
        super(context);
        this.mReplaceRunnable = new com.tencent.mm.ui.widget.dialog.j2(this);
        b();
    }

    private void b() {
        if (android.os.Build.VERSION.SDK_INT > 28) {
            return;
        }
        try {
            java.lang.reflect.Field declaredField = android.app.Dialog.class.getDeclaredField("mDismissAction");
            declaredField.setAccessible(true);
            try {
                java.lang.reflect.Field declaredField2 = java.lang.reflect.Field.class.getDeclaredField("accessFlags");
                declaredField2.setAccessible(true);
                declaredField2.setInt(declaredField, declaredField.getModifiers() & (-17));
            } catch (java.lang.Exception unused) {
            }
            this.mHijackDismissAction = (java.lang.Runnable) declaredField.get(this);
            declaredField.set(this, this.mReplaceRunnable);
        } catch (java.lang.IllegalAccessException unused2) {
            com.tencent.mm.ui.yk.b(TAG, "hijack fail IllegalAccessException", new java.lang.Object[0]);
        } catch (java.lang.NoSuchFieldException unused3) {
            com.tencent.mm.ui.yk.b(TAG, "hijack fail NoSuchFieldException", new java.lang.Object[0]);
        }
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        try {
            super.dismiss();
        } catch (java.lang.Exception e17) {
            com.tencent.mm.ui.yk.d(TAG, e17, "", new java.lang.Object[0]);
        }
        com.tencent.mm.ui.widget.dialog.l lVar = this.iOnDialogDismissListener;
        if (lVar != null) {
            lVar.onDialogDismiss(this);
        }
    }

    public void setiOnDialogDismissListener(com.tencent.mm.ui.widget.dialog.l lVar) {
        this.iOnDialogDismissListener = lVar;
    }

    @Override // android.app.Dialog
    public void show() {
        try {
            super.show();
        } catch (java.lang.Exception e17) {
            com.tencent.mm.ui.yk.d(TAG, e17, "", new java.lang.Object[0]);
        }
    }

    public k2(android.content.Context context, int i17) {
        super(context, i17);
        this.mReplaceRunnable = new com.tencent.mm.ui.widget.dialog.j2(this);
        b();
    }
}
