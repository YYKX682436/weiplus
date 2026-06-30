package com.tencent.wework.api.model;

/* loaded from: classes9.dex */
public abstract class BaseMessage {

    /* renamed from: a, reason: collision with root package name */
    public android.content.Context f220145a = null;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f220146b;

    public static android.os.Bundle c(com.tencent.wework.api.model.BaseMessage baseMessage) {
        if (baseMessage == null) {
            return null;
        }
        android.os.Bundle bundle = new android.os.Bundle();
        baseMessage.f(bundle);
        bundle.putString("_wwobject_identifier_", baseMessage.getClass().getName());
        return bundle;
    }

    public void a(android.content.Intent intent, java.lang.String str) {
    }

    public abstract boolean b();

    public void d(android.content.Context context) {
        this.f220145a = context;
    }

    public void e(java.lang.String str) {
        this.f220146b = str;
    }

    public abstract void f(android.os.Bundle bundle);
}
