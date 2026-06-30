package com.tencent.mm.ui.anim;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/ui/anim/RepairerSharedElementDemo1;", "Lcom/tencent/mm/plugin/secdata/ui/MMSecDataActivity;", "<init>", "()V", "app_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class RepairerSharedElementDemo1 extends com.tencent.mm.plugin.secdata.ui.MMSecDataActivity {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f197152d = jz5.h.b(new na5.j(this));

    public final android.widget.ImageView U6() {
        return (android.widget.ImageView) ((jz5.n) this.f197152d).getValue();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bpd;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("SharedElementDemo");
        U6().setImageResource(com.tencent.mm.R.drawable.f481195mt);
        U6().setOnClickListener(new na5.k(this));
    }

    @Override // com.tencent.mm.plugin.secdata.ui.MMSecDataActivity, com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(wa5.j.class);
    }
}
