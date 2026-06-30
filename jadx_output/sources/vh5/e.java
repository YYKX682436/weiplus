package vh5;

/* loaded from: classes3.dex */
public final class e extends lf3.n implements lf3.j, vh5.n {

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f437203d;

    /* renamed from: e, reason: collision with root package name */
    public vh5.d f437204e;

    /* renamed from: f, reason: collision with root package name */
    public float f437205f;

    /* renamed from: g, reason: collision with root package name */
    public float f437206g;

    /* renamed from: h, reason: collision with root package name */
    public float f437207h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f437205f = 1.0f;
    }

    @Override // lf3.j
    public void E2(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        vh5.d dVar = this.f437204e;
        if (dVar != null) {
            ((com.tencent.mm.ui.chatting.gallery.j5) dVar).f201062a.f200626k2 = contentView;
        }
        if (dVar != null) {
            float f17 = this.f437205f;
            float f18 = this.f437206g;
            float f19 = this.f437207h;
            com.tencent.mm.ui.chatting.gallery.ImageGalleryUI imageGalleryUI = ((com.tencent.mm.ui.chatting.gallery.j5) dVar).f201062a;
            imageGalleryUI.f200684z3 = f17;
            imageGalleryUI.A3 = (int) f18;
            imageGalleryUI.B3 = (int) f19;
            ((com.tencent.mm.ui.chatting.gallery.i5) imageGalleryUI.f200613g3).b();
        }
    }

    @Override // lf3.j
    public void N3(lf3.i iVar) {
    }

    @Override // lf3.j
    public void d3(float f17) {
        if (this.f437203d == null) {
            this.f437203d = getActivity().findViewById(com.tencent.mm.R.id.ght);
        }
        android.view.View view = this.f437203d;
        if (view == null) {
            return;
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Float.valueOf(f17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/media/chat/legacy/ChatPageAniComponent", "setBgAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
        view.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
        yj0.a.f(view, "com/tencent/mm/ui/media/chat/legacy/ChatPageAniComponent", "setBgAlpha", "(F)V", "android/view/View_EXEC_", "setAlpha", "(F)V");
    }

    @Override // lf3.j
    public void m6(android.view.View contentView, int i17, int i18) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        java.lang.System.currentTimeMillis();
    }

    @Override // lf3.o, com.tencent.mm.ui.component.UIComponent
    public void onViewCreated(android.view.View contentView) {
        kotlin.jvm.internal.o.g(contentView, "contentView");
        super.onViewCreated(contentView);
    }
}
