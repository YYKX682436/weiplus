package com.tencent.mm.plugin.textstatus.conversation.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/textstatus/conversation/ui/TextStatusGreetingActivity;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-textstatus_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public class TextStatusGreetingActivity extends com.tencent.mm.ui.MMActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f173210e = 0;

    /* renamed from: d, reason: collision with root package name */
    public androidx.fragment.app.Fragment f173211d;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f489559cz1;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.f493363jw0);
        setBackBtn(new mi4.b(this));
        if (this.f173211d == null) {
            this.f173211d = new com.tencent.mm.plugin.textstatus.conversation.ui.TextStatusGreetingFragment();
        }
        androidx.fragment.app.Fragment fragment = this.f173211d;
        if (fragment != null) {
            androidx.fragment.app.i2 beginTransaction = getSupportFragmentManager().beginTransaction();
            kotlin.jvm.internal.o.f(beginTransaction, "beginTransaction(...)");
            beginTransaction.k(com.tencent.mm.R.id.gd9, fragment, null);
            beginTransaction.f();
        }
    }
}
