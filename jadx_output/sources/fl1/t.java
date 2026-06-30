package fl1;

/* loaded from: classes14.dex */
public final class t implements fl1.h2 {

    /* renamed from: a, reason: collision with root package name */
    public final fl1.u f263867a;

    /* renamed from: b, reason: collision with root package name */
    public final fl1.c0 f263868b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f263869c;

    public t(fl1.u accessibilityFixer, fl1.c0 dialogContainer) {
        kotlin.jvm.internal.o.g(accessibilityFixer, "accessibilityFixer");
        kotlin.jvm.internal.o.g(dialogContainer, "dialogContainer");
        this.f263867a = accessibilityFixer;
        this.f263868b = dialogContainer;
        dialogContainer.setListener(this);
    }
}
