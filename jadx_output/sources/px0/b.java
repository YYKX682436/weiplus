package px0;

/* loaded from: classes5.dex */
public final class b extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment f358766d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(com.tencent.mm.mj_publisher.finder.shoot_composing.fragment.MaterialImportPreviewFragment materialImportPreviewFragment) {
        super(0);
        this.f358766d = materialImportPreviewFragment;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.view.View view = this.f358766d.f69646g;
        if (view != null) {
            return (com.tencent.mm.ui.widget.imageview.WeImageView) view.findViewById(com.tencent.mm.R.id.bzh);
        }
        return null;
    }
}
