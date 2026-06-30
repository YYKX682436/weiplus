package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class k2 extends com.tencent.mm.ui.component.UIComponent {

    /* renamed from: d, reason: collision with root package name */
    public static int f174026d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onCreate(android.os.Bundle bundle) {
        f174026d++;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        f174026d--;
    }
}
