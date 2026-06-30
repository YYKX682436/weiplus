package com.tencent.mm.ui.conversation;

/* loaded from: classes9.dex */
public class SettingCheckUnProcessWalletConvUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ListView f207423d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.List f207424e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.ui.conversation.jb f207425f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f207426g = new int[2];

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.ckj;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle(com.tencent.mm.R.string.kkf);
        setBackBtn(new com.tencent.mm.ui.conversation.ab(this));
        this.f207423d = (android.widget.ListView) findViewById(com.tencent.mm.R.id.cit);
        java.util.ArrayList<java.lang.String> stringArrayListExtra = getIntent().getStringArrayListExtra("key_conversation_list");
        this.f207424e = stringArrayListExtra;
        if (stringArrayListExtra == null || stringArrayListExtra.size() <= 0) {
            return;
        }
        com.tencent.mm.ui.conversation.jb jbVar = new com.tencent.mm.ui.conversation.jb(this);
        this.f207425f = jbVar;
        this.f207423d.setAdapter((android.widget.ListAdapter) jbVar);
        this.f207423d.setOnTouchListener(new com.tencent.mm.ui.conversation.bb(this));
        this.f207423d.setOnItemClickListener(new com.tencent.mm.ui.conversation.cb(this));
        this.f207423d.setOnItemLongClickListener(new com.tencent.mm.ui.conversation.gb(this));
    }
}
