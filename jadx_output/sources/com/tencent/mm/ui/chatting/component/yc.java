package com.tencent.mm.ui.chatting.component;

/* loaded from: classes13.dex */
public class yc implements kn.i0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.zc f200310a;

    public yc(com.tencent.mm.ui.chatting.component.zc zcVar) {
        this.f200310a = zcVar;
    }

    @Override // kn.i0
    public void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "handleTodoLongClickImp addtodo");
    }

    @Override // kn.i0
    public void b() {
        android.util.Pair pair;
        com.tencent.mm.ui.chatting.component.zc zcVar = this.f200310a;
        rn.c cVar = zcVar.f200367d;
        rn.c z07 = ((nn.j) i95.n0.c(nn.j.class)).Bi().z0(cVar.field_roomname, cVar.field_todoid);
        if (z07 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.roomTodo.RoomTodoHelp", "recallTodoByTodoBarMenu stoTodo no exist");
            pair = new android.util.Pair(java.lang.Boolean.FALSE, cVar.field_todoid);
        } else {
            java.util.Iterator it = ((java.util.ArrayList) z07.S).iterator();
            while (it.hasNext()) {
                com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(cVar.field_roomname, ((java.lang.Long) it.next()).longValue());
                o27.s3("");
                ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(o27.getMsgId(), o27, true);
            }
            ((nn.j) i95.n0.c(nn.j.class)).Ri().a(cVar.field_roomname, 1, kn.j0.b(z07));
            boolean i17 = kn.j0.i(z07);
            com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.RoomTodoHelp", "recallTodoByTodoBarMenu todoId:%s result:%s", cVar.field_todoid, java.lang.Boolean.valueOf(i17));
            pair = new android.util.Pair(java.lang.Boolean.valueOf(i17), cVar.field_todoid);
        }
        if (((java.lang.Boolean) pair.first).booleanValue()) {
            zcVar.f200369f.f198732a.n0(zcVar.f200367d);
            zcVar.f200369f.f198732a.f199768m.notifyItemRemoved(zcVar.f200368e);
            zcVar.f200369f.f198732a.p0();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.roomTodo.GroupTodoComponent", "handleTodoLongClickImp recall result:%s", pair);
    }
}
