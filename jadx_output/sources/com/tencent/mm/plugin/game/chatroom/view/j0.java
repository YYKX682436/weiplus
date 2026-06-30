package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class j0 extends androidx.recyclerview.widget.f2 {

    /* renamed from: e, reason: collision with root package name */
    public final w33.a f139180e;

    /* renamed from: f, reason: collision with root package name */
    public final w33.a f139181f;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView f139185m;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f139179d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: g, reason: collision with root package name */
    public boolean f139182g = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f139183h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f139184i = new java.util.HashMap();

    public j0(com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView chatRoomListView) {
        this.f139185m = chatRoomListView;
        this.f139180e = new w33.a(1, null, false, chatRoomListView.f138901f2.getString(com.tencent.mm.R.string.fod));
        this.f139181f = new w33.a(3, null, false, chatRoomListView.f138901f2.getString(com.tencent.mm.R.string.fox));
    }

    public synchronized void B(java.util.List list) {
        boolean z17;
        int indexOf = ((java.util.concurrent.CopyOnWriteArrayList) this.f139179d).indexOf(this.f139181f);
        if (indexOf >= 0) {
            java.util.List list2 = this.f139179d;
            ((java.util.concurrent.CopyOnWriteArrayList) list2).removeAll(((java.util.concurrent.CopyOnWriteArrayList) list2).subList(indexOf, ((java.util.concurrent.CopyOnWriteArrayList) list2).size()));
        }
        com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView chatRoomListView = this.f139185m;
        chatRoomListView.i1(chatRoomListView.f138903h2);
        ((java.util.concurrent.CopyOnWriteArrayList) this.f139179d).add(this.f139181f);
        y();
        if (com.tencent.mm.sdk.platformtools.t8.L0(list)) {
            z17 = false;
        } else {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedList.add(new w33.a(4, (com.tencent.mm.plugin.game.autogen.chatroom.ChatroomRecInfo) it.next()));
            }
            z17 = linkedList.size() != 0;
            ((java.util.concurrent.CopyOnWriteArrayList) this.f139179d).addAll(linkedList);
            notifyDataSetChanged();
        }
        if (z17) {
            this.f139185m.f138903h2.a();
            com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
            com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView chatRoomListView2 = this.f139185m;
            fVar.k(1002L, 0L, 1L, 0L, chatRoomListView2.f138906k2, chatRoomListView2.f138905j2, "", "", "");
        } else {
            android.view.View view = this.f139185m.f138903h2.f138891n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/game/chatroom/view/ChatRoomFooterView", "showEmptyView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView chatRoomListView3 = this.f139185m;
        chatRoomListView3.addFooterView(chatRoomListView3.f138903h2);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.concurrent.CopyOnWriteArrayList) this.f139179d).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((w33.a) ((java.util.concurrent.CopyOnWriteArrayList) this.f139179d).get(i17)).f442699a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    @Override // androidx.recyclerview.widget.f2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.recyclerview.widget.k3 r31, int r32) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.game.chatroom.view.j0.onBindViewHolder(androidx.recyclerview.widget.k3, int):void");
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        androidx.recyclerview.widget.k3 i1Var;
        com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView chatRoomListView = this.f139185m;
        if (i17 != 1) {
            if (i17 == 2) {
                i1Var = new com.tencent.mm.plugin.game.chatroom.view.v0(android.view.LayoutInflater.from(chatRoomListView.f138901f2).inflate(com.tencent.mm.R.layout.c5s, viewGroup, false));
            } else if (i17 != 3) {
                if (i17 != 4) {
                    return null;
                }
                i1Var = new com.tencent.mm.plugin.game.chatroom.view.e1(android.view.LayoutInflater.from(chatRoomListView.f138901f2).inflate(com.tencent.mm.R.layout.ccv, viewGroup, false));
            }
            return i1Var;
        }
        i1Var = new com.tencent.mm.plugin.game.chatroom.view.i1(android.view.LayoutInflater.from(chatRoomListView.f138901f2).inflate(com.tencent.mm.R.layout.f488389rz, viewGroup, false));
        return i1Var;
    }

    public final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData x(int i17) {
        w33.a aVar;
        java.util.List list = this.f139179d;
        if (i17 >= ((java.util.concurrent.CopyOnWriteArrayList) list).size() || i17 < 0 || (aVar = (w33.a) ((java.util.concurrent.CopyOnWriteArrayList) list).get(i17)) == null) {
            return null;
        }
        return com.tencent.mm.plugin.game.chatroom.view.j1.b(aVar);
    }

    public void y() {
        com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView chatRoomListView = this.f139185m;
        if (chatRoomListView.f138908m2 == null) {
            return;
        }
        java.util.List list = this.f139179d;
        w33.a aVar = this.f139180e;
        int indexOf = ((java.util.concurrent.CopyOnWriteArrayList) list).indexOf(aVar);
        w33.a aVar2 = this.f139181f;
        int indexOf2 = ((java.util.concurrent.CopyOnWriteArrayList) list).indexOf(aVar2);
        if (indexOf >= 0) {
            aVar.f442703e = chatRoomListView.f138908m2;
            aVar2.f442703e = null;
            aVar2.f442702d = chatRoomListView.f138901f2.getString(com.tencent.mm.R.string.fox);
        } else {
            aVar.f442703e = null;
            aVar2.f442703e = chatRoomListView.f138908m2;
            aVar2.f442702d = chatRoomListView.f138901f2.getString(com.tencent.mm.R.string.fou);
        }
        if (indexOf >= 0) {
            notifyItemChanged(indexOf);
        }
        if (indexOf2 >= 0) {
            notifyItemChanged(indexOf2);
        }
    }

    public synchronized void z(java.util.List list) {
        if (list != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            linkedList.addAll(this.f139179d);
            java.util.LinkedList linkedList2 = new java.util.LinkedList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedList2.add(new w33.a(2, (com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo) it.next()));
            }
            int indexOf = ((java.util.concurrent.CopyOnWriteArrayList) this.f139179d).indexOf(this.f139180e);
            int indexOf2 = ((java.util.concurrent.CopyOnWriteArrayList) this.f139179d).indexOf(this.f139181f);
            if (indexOf2 < 0) {
                indexOf2 = ((java.util.concurrent.CopyOnWriteArrayList) this.f139179d).size();
            }
            if (list.size() == 0) {
                ((java.util.concurrent.CopyOnWriteArrayList) this.f139179d).removeAll(((java.util.concurrent.CopyOnWriteArrayList) this.f139179d).subList(0, indexOf2));
            } else {
                if (indexOf < 0) {
                    ((java.util.concurrent.CopyOnWriteArrayList) this.f139179d).add(0, this.f139180e);
                    ((java.util.concurrent.CopyOnWriteArrayList) this.f139179d).addAll(1, linkedList2);
                } else {
                    ((java.util.concurrent.CopyOnWriteArrayList) this.f139179d).removeAll(((java.util.concurrent.CopyOnWriteArrayList) this.f139179d).subList(1, indexOf2));
                    ((java.util.concurrent.CopyOnWriteArrayList) this.f139179d).addAll(1, linkedList2);
                }
                if (!this.f139182g) {
                    this.f139182g = true;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("GroupNum", linkedList2.size());
                    } catch (org.json.JSONException unused) {
                    }
                    com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
                    com.tencent.mm.plugin.game.chatroom.view.ChatRoomListView chatRoomListView = this.f139185m;
                    fVar.k(1001L, 0L, 1L, 0L, chatRoomListView.f138906k2, chatRoomListView.f138905j2, "", "", jSONObject.toString());
                }
            }
            androidx.recyclerview.widget.h0.a(new com.tencent.mm.plugin.game.chatroom.view.h0(this.f139185m, linkedList, this.f139179d), true).a(new com.tencent.mm.plugin.game.chatroom.view.i0(this));
            y();
        }
    }
}
