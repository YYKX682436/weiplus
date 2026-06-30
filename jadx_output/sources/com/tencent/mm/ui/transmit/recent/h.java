package com.tencent.mm.ui.transmit.recent;

/* JADX INFO: Access modifiers changed from: package-private */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000e\u0010\u0003\u001a\n \u0002*\u0004\u0018\u00010\u00040\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroid/os/Bundle;", "kotlin.jvm.PlatformType", "it", "Lcom/tencent/mm/ipcinvoker/type/IPCVoid;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class h<InputType, ResultType> implements com.tencent.mm.ipcinvoker.k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.ui.transmit.recent.h f211055a = new com.tencent.mm.ui.transmit.recent.h();

    @Override // com.tencent.mm.ipcinvoker.k0
    public java.lang.Object invoke(java.lang.Object obj) {
        java.util.ArrayList<? extends android.os.Parcelable> a17 = new com.tencent.mm.ui.transmit.recent.i().a();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putParcelableArrayList("list", a17);
        return bundle;
    }
}
