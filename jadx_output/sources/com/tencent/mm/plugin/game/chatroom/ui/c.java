package com.tencent.mm.plugin.game.chatroom.ui;

/* loaded from: classes15.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f138831a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f138832b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f138833c;

    /* renamed from: d, reason: collision with root package name */
    public long f138834d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Queue f138835e;

    /* renamed from: f, reason: collision with root package name */
    public wu5.c f138836f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.TimerTask f138837g;

    public c(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f138831a = context;
        this.f138835e = new java.util.ArrayDeque();
        this.f138837g = new com.tencent.mm.plugin.game.chatroom.ui.b(this);
    }
}
