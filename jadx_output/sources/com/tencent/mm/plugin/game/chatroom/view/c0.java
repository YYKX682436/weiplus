package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.ChatRoomJoinOrQuitEvent f139050d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView.AnonymousClass2 f139051e;

    public c0(com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView.AnonymousClass2 anonymousClass2, com.tencent.mm.autogen.events.ChatRoomJoinOrQuitEvent chatRoomJoinOrQuitEvent) {
        this.f139051e = anonymousClass2;
        this.f139050d = chatRoomJoinOrQuitEvent;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        r1 = r0.f139179d;
        ((java.util.concurrent.CopyOnWriteArrayList) r1).remove(((java.util.concurrent.CopyOnWriteArrayList) r1).get(r2));
        r0.notifyItemRemoved(r2);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r5 = this;
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView$2 r0 = r5.f139051e
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView r0 = com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView.this
            com.tencent.mm.plugin.game.chatroom.view.j0 r0 = r0.f138902g2
            com.tencent.mm.autogen.events.ChatRoomJoinOrQuitEvent r1 = r5.f139050d
            am.c2 r1 = r1.f54038g
            java.lang.String r1 = r1.f6303b
            monitor-enter(r0)
            r2 = 0
        Le:
            java.util.List r3 = r0.f139179d     // Catch: java.lang.Throwable -> L4d
            java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3     // Catch: java.lang.Throwable -> L4d
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L4d
            if (r2 >= r3) goto L4b
            java.util.List r3 = r0.f139179d     // Catch: java.lang.Throwable -> L4d
            java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L4d
            w33.a r3 = (w33.a) r3     // Catch: java.lang.Throwable -> L4d
            com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData r3 = com.tencent.mm.plugin.game.chatroom.view.j1.b(r3)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L48
            java.lang.String r3 = r3.chatroom_name     // Catch: java.lang.Throwable -> L4d
            boolean r4 = com.tencent.mm.sdk.platformtools.t8.f192989a     // Catch: java.lang.Throwable -> L4d
            if (r3 != 0) goto L30
            java.lang.String r3 = ""
        L30:
            boolean r3 = r3.equals(r1)     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L48
            java.util.List r1 = r0.f139179d     // Catch: java.lang.Throwable -> L4d
            r3 = r1
            java.util.concurrent.CopyOnWriteArrayList r3 = (java.util.concurrent.CopyOnWriteArrayList) r3     // Catch: java.lang.Throwable -> L4d
            java.lang.Object r3 = r3.get(r2)     // Catch: java.lang.Throwable -> L4d
            java.util.concurrent.CopyOnWriteArrayList r1 = (java.util.concurrent.CopyOnWriteArrayList) r1     // Catch: java.lang.Throwable -> L4d
            r1.remove(r3)     // Catch: java.lang.Throwable -> L4d
            r0.notifyItemRemoved(r2)     // Catch: java.lang.Throwable -> L4d
            goto L4b
        L48:
            int r2 = r2 + 1
            goto Le
        L4b:
            monitor-exit(r0)
            return
        L4d:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.chatroom.view.c0.run():void");
    }
}
