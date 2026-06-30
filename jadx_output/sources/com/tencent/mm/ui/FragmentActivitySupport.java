package com.tencent.mm.ui;

/* loaded from: classes11.dex */
public abstract class FragmentActivitySupport extends com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment {
    private byte _hellAccFlag_;
    public android.content.Intent fragmentIntent;
    public boolean hasDestory;
    public boolean isCurrentActivity;
    private androidx.fragment.app.FragmentActivity mActivity;

    public FragmentActivitySupport(boolean z17) {
        this.hasDestory = false;
        this.fragmentIntent = new android.content.Intent();
        this.isCurrentActivity = z17;
    }

    public android.view.View findViewById(int i17) {
        android.view.View view = getView();
        android.view.View findViewById = view != null ? view.findViewById(i17) : null;
        return findViewById != null ? findViewById : thisActivity().findViewById(i17);
    }

    public android.view.LayoutInflater getActivityLayoutInflater() {
        return thisActivity().getLayoutInflater();
    }

    public java.lang.Boolean getBooleanExtra(java.lang.String str, boolean z17) {
        return (this.isCurrentActivity && getArguments() == null) ? java.lang.Boolean.valueOf(thisActivity().getIntent().getBooleanExtra(str, z17)) : java.lang.Boolean.valueOf(getArguments().getBoolean(str, z17));
    }

    public byte[] getByteArrayExtra(java.lang.String str) {
        byte[] byteArrayExtra = (!this.isCurrentActivity || thisActivity() == null) ? null : thisActivity().getIntent().getByteArrayExtra(str);
        return (byteArrayExtra != null || getArguments() == null) ? byteArrayExtra : super.getArguments().getByteArray(str);
    }

    public android.content.ContentResolver getContentResolver() {
        if (thisActivity() != null) {
            return thisActivity().getContentResolver();
        }
        return null;
    }

    public int getIntExtra(java.lang.String str, int i17) {
        return (this.isCurrentActivity && getArguments() == null && thisActivity() != null) ? thisActivity().getIntent().getIntExtra(str, i17) : getArguments() != null ? getArguments().getInt(str, i17) : i17;
    }

    public android.content.Intent getIntent() {
        return (this.isCurrentActivity && getArguments() == null && thisActivity() != null) ? thisActivity().getIntent() : this.fragmentIntent;
    }

    public long getLongExtra(java.lang.String str, long j17) {
        return (this.isCurrentActivity && getArguments() == null) ? thisActivity().getIntent().getLongExtra(str, j17) : getArguments() != null ? getArguments().getLong(str, j17) : j17;
    }

    public java.lang.String getPackageName() {
        return thisActivity().getPackageName();
    }

    public <T extends android.os.Parcelable> T getParcelableExtra(java.lang.String str) {
        T t17 = (!this.isCurrentActivity || thisActivity() == null) ? null : (T) thisActivity().getIntent().getParcelableExtra(str);
        return (t17 != null || getArguments() == null) ? t17 : (T) super.getArguments().getParcelable(str);
    }

    public android.content.SharedPreferences getSharedPreferences(java.lang.String str, int i17) {
        return thisActivity().getSharedPreferences(str, i17);
    }

    public java.lang.String[] getStringArrayExtra(java.lang.String str) {
        return (this.isCurrentActivity && getArguments() == null) ? thisActivity().getIntent().getStringArrayExtra(str) : getArguments().getStringArray(str);
    }

    public java.util.ArrayList<java.lang.String> getStringArrayList(java.lang.String str) {
        return (this.isCurrentActivity && getArguments() == null) ? thisActivity().getIntent().getStringArrayListExtra(str) : getArguments().getStringArrayList(str);
    }

    public java.lang.String getStringExtra(java.lang.String str) {
        java.lang.String stringExtra = (!this.isCurrentActivity || thisActivity() == null) ? null : thisActivity().getIntent().getStringExtra(str);
        return (stringExtra != null || getArguments() == null) ? stringExtra : super.getArguments().getString(str);
    }

    public android.view.Window getWindow() {
        if (thisActivity() != null) {
            return thisActivity().getWindow();
        }
        return null;
    }

    public android.view.WindowManager getWindowManager() {
        if (thisActivity() != null) {
            return thisActivity().getWindowManager();
        }
        return null;
    }

    public boolean isFinishing() {
        if (thisActivity() == null) {
            return true;
        }
        return thisActivity().isFinishing();
    }

    public boolean isShowing() {
        return !this.hasDestory;
    }

    public final android.database.Cursor managedQuery(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        if (thisActivity() != null) {
            return thisActivity().managedQuery(uri, strArr, str, strArr2, str2);
        }
        return null;
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.mActivity = getActivity();
    }

    @Override // com.tencent.mm.hellhoundlib.fragments.HellAndroidXFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.hasDestory = true;
    }

    public void openContextMenu(android.view.View view) {
        if (thisActivity() != null) {
            thisActivity().openContextMenu(view);
        }
    }

    public void overridePendingTransition(int i17, int i18) {
        if (thisActivity() != null) {
            thisActivity().overridePendingTransition(i17, i18);
        }
    }

    public void removeExtra(java.lang.String str) {
        if (this.isCurrentActivity && getArguments() == null) {
            thisActivity().getIntent().removeExtra(str);
        } else if (getArguments() != null) {
            getArguments().remove(str);
        }
    }

    public void sendBroadcast(android.content.Intent intent) {
        thisActivity().sendBroadcast(intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(android.os.Bundle bundle) {
        super.setArguments(bundle);
        this.fragmentIntent.putExtras(bundle);
    }

    public void setBooleanExtra(java.lang.String str, boolean z17) {
        if (this.isCurrentActivity && getArguments() == null) {
            thisActivity().getIntent().putExtra(str, z17);
        } else if (getArguments() != null) {
            getArguments().putBoolean(str, z17);
        }
    }

    public void setRequestedOrientation(int i17) {
        if (thisActivity() != null) {
            thisActivity().setRequestedOrientation(i17);
        }
    }

    public void setResult(int i17) {
        if (this.isCurrentActivity) {
            thisActivity().setResult(i17);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void startActivity(android.content.Intent intent) {
        androidx.fragment.app.FragmentActivity thisActivity = thisActivity();
        if (thisActivity != null) {
            thisActivity.startActivityFromFragment(this, intent, -1);
            return;
        }
        android.content.Context context = com.tencent.mm.sdk.platformtools.x2.f193071a;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/ui/FragmentActivitySupport", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/ui/FragmentActivitySupport", "startActivity", "(Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public void startFragment(java.lang.Class<?> cls, android.content.Intent intent) {
        if (this.isCurrentActivity) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(this, arrayList.toArray(), "com/tencent/mm/ui/FragmentActivitySupport", "startFragment", "(Ljava/lang/Class;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(this, "com/tencent/mm/ui/FragmentActivitySupport", "startFragment", "(Ljava/lang/Class;Landroid/content/Intent;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
    }

    public androidx.fragment.app.FragmentActivity thisActivity() {
        if (this.mActivity == null) {
            this.mActivity = getActivity();
        }
        return this.mActivity;
    }

    public void setResult(int i17, android.content.Intent intent) {
        if (this.isCurrentActivity) {
            thisActivity().setResult(i17);
        } else {
            thisActivity().setResult(i17, intent);
        }
    }

    public FragmentActivitySupport() {
        this.hasDestory = false;
        this.fragmentIntent = new android.content.Intent();
        this.isCurrentActivity = false;
    }
}
