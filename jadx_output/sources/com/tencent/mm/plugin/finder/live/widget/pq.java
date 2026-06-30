package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes9.dex */
public final class pq extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f119405d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq(android.content.Context context) {
        super(0);
        this.f119405d = context;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        android.content.Context context = this.f119405d;
        androidx.appcompat.app.AppCompatActivity appCompatActivity = context instanceof androidx.appcompat.app.AppCompatActivity ? (androidx.appcompat.app.AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            return new com.tencent.mm.plugin.finder.live.viewmodel.e2(appCompatActivity);
        }
        return null;
    }
}
