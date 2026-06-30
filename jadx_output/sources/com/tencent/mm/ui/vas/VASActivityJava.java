package com.tencent.mm.ui.vas;

/* loaded from: classes14.dex */
public abstract class VASActivityJava extends com.tencent.mm.ui.MMActivity {
    @Override // com.tencent.mm.ui.MMFragmentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity
    public <T extends android.view.View> T findViewById(int i17) {
        if (isCallFindViewSuper()) {
            return (T) super.findViewById(i17);
        }
        T t17 = (T) findViewByIdInner(i17);
        int i18 = ih5.c.f291603a;
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        return t17;
    }

    public final <T extends android.view.View> T findViewByIdInWrapActivity(int i17) {
        return isCallFindViewSuper() ? (T) super.findViewById(i17) : (T) findViewByIdInWrapActivityInner(i17);
    }

    public android.view.View findViewByIdInWrapActivityInner(int i17) {
        return null;
    }

    public android.view.View findViewByIdInner(int i17) {
        return null;
    }

    public boolean isCallFindViewSuper() {
        return true;
    }
}
