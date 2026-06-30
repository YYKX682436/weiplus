package te2;

/* loaded from: classes3.dex */
public final class c9 extends im2.w4 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.Presenter f417931d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c9(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public int getLayoutId() {
        return com.tencent.mm.R.layout.f488999b04;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.ViewCallback viewCallback;
        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.Presenter presenter = this.f417931d;
        if (presenter == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        if (i18 == -1 && i17 == 1 && (viewCallback = presenter.f122786h) != null) {
            viewCallback.a();
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        O6();
        boolean booleanExtra = getIntent().getBooleanExtra("KEY_HAS_NEXT_ACTION", false);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.Serializable serializableExtra = getIntent().getSerializableExtra("KEY_TAG_INFO");
        java.util.List<byte[]> list = serializableExtra instanceof java.util.List ? (java.util.List) serializableExtra : null;
        if (list != null) {
            for (byte[] bArr : list) {
                r45.fd2 fd2Var = new r45.fd2();
                fd2Var.parseFrom(bArr);
                arrayList.add(fd2Var);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new so2.u2((r45.fd2) it.next()));
        }
        this.f417931d = new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.Presenter(arrayList2, booleanExtra);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        kotlin.jvm.internal.o.e(activity, "null cannot be cast to non-null type com.tencent.mm.ui.MMActivity");
        com.tencent.mm.ui.MMActivity mMActivity = (com.tencent.mm.ui.MMActivity) activity;
        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.Presenter presenter = this.f417931d;
        if (presenter == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.ViewCallback viewCallback = new com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.ViewCallback(mMActivity, presenter);
        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.Presenter presenter2 = this.f417931d;
        if (presenter2 == null) {
            kotlin.jvm.internal.o.o("presenter");
            throw null;
        }
        presenter2.c(viewCallback);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        com.tencent.mm.plugin.finder.presenter.contract.FinderLiveTagConstract.Presenter presenter = this.f417931d;
        if (presenter == null || presenter != null) {
            return;
        }
        kotlin.jvm.internal.o.o("presenter");
        throw null;
    }
}
