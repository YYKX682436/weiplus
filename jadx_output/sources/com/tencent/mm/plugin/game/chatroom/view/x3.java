package com.tencent.mm.plugin.game.chatroom.view;

/* loaded from: classes8.dex */
public class x3 extends androidx.recyclerview.widget.f2 {

    /* renamed from: e, reason: collision with root package name */
    public final w33.a f139345e;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f139351n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView f139352o;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f139344d = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: f, reason: collision with root package name */
    public final w33.a f139346f = new w33.a(5, null, false, null, null, new w33.d(true, false, false));

    /* renamed from: g, reason: collision with root package name */
    public boolean f139347g = false;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f139348h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f139349i = new java.util.concurrent.CopyOnWriteArrayList();

    /* renamed from: m, reason: collision with root package name */
    public boolean f139350m = false;

    public x3(com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView myChatRoomListView, boolean z17) {
        this.f139352o = myChatRoomListView;
        this.f139345e = new w33.a(1, null, false, myChatRoomListView.f139000f2.getString(com.tencent.mm.R.string.fod));
        this.f139351n = false;
        this.f139351n = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatRoomListView", "MyChatroomAdapter enableCollapse = " + z17);
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemCount() {
        return ((java.util.concurrent.CopyOnWriteArrayList) this.f139344d).size();
    }

    @Override // androidx.recyclerview.widget.f2
    public int getItemViewType(int i17) {
        return ((w33.a) ((java.util.concurrent.CopyOnWriteArrayList) this.f139344d).get(i17)).f442699a;
    }

    @Override // androidx.recyclerview.widget.f2
    public void onBindViewHolder(androidx.recyclerview.widget.k3 k3Var, int i17) {
        if (k3Var == null) {
            return;
        }
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData x17 = x(i17);
        java.util.List list = this.f139344d;
        int i18 = 0;
        if (x17 != null && getItemViewType(i17) == 2) {
            i18 = i17 - ((java.util.concurrent.CopyOnWriteArrayList) list).indexOf(this.f139345e);
        }
        int i19 = i18;
        com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData x18 = x(i17);
        int itemViewType = getItemViewType(i17);
        com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView myChatRoomListView = this.f139352o;
        if (x18 != null) {
            java.util.ArrayList arrayList = (java.util.ArrayList) this.f139348h;
            if (!arrayList.contains(x18.chatroom_name)) {
                arrayList.add(x18.chatroom_name);
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                try {
                    jSONObject.put("reportStr", x18.report_str);
                } catch (java.lang.Exception unused) {
                }
                com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
                if (itemViewType == 2) {
                    fVar.k(1001L, i19, 1L, 0L, myChatRoomListView.f139003i2, myChatRoomListView.f139002h2, x18.appid, x18.chatroom_name, jSONObject.toString());
                } else if (itemViewType == 4) {
                    fVar.k(1002L, i19, 1L, 0L, myChatRoomListView.f139003i2, myChatRoomListView.f139002h2, x18.appid, x18.chatroom_name, jSONObject.toString());
                }
            }
        }
        w33.a aVar = (w33.a) ((java.util.concurrent.CopyOnWriteArrayList) list).get(i17);
        int i27 = com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView.f138999q2;
        myChatRoomListView.getClass();
        ((com.tencent.mm.plugin.game.chatroom.view.t0) k3Var).i(aVar, null, i19, myChatRoomListView.f139003i2, myChatRoomListView.f139002h2, myChatRoomListView.f139004j2);
        if (k3Var instanceof com.tencent.mm.plugin.game.chatroom.view.w0) {
            w33.d dVar = ((w33.a) ((java.util.concurrent.CopyOnWriteArrayList) list).get(i17)).f442704f;
            ((com.tencent.mm.plugin.game.chatroom.view.w0) k3Var).j(dVar.f442713a, dVar.f442714b);
            k3Var.itemView.setOnClickListener(new com.tencent.mm.plugin.game.chatroom.view.w3(this, i17, k3Var, dVar));
        }
    }

    @Override // androidx.recyclerview.widget.f2
    public androidx.recyclerview.widget.k3 onCreateViewHolder(android.view.ViewGroup viewGroup, int i17) {
        androidx.recyclerview.widget.k3 i1Var;
        com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView myChatRoomListView = this.f139352o;
        if (i17 != 1) {
            if (i17 == 2) {
                i1Var = new com.tencent.mm.plugin.game.chatroom.view.v0(android.view.LayoutInflater.from(myChatRoomListView.f139000f2).inflate(com.tencent.mm.R.layout.c5s, viewGroup, false));
            } else if (i17 != 3) {
                if (i17 != 5) {
                    return null;
                }
                i1Var = new com.tencent.mm.plugin.game.chatroom.view.w0(android.view.LayoutInflater.from(myChatRoomListView.f139000f2).inflate(com.tencent.mm.R.layout.bmf, viewGroup, false));
            }
            return i1Var;
        }
        i1Var = new com.tencent.mm.plugin.game.chatroom.view.i1(android.view.LayoutInflater.from(myChatRoomListView.f139000f2).inflate(com.tencent.mm.R.layout.f488389rz, viewGroup, false));
        return i1Var;
    }

    public final com.tencent.mm.plugin.game.autogen.chatroom.ChatroomData x(int i17) {
        w33.a aVar;
        java.util.List list = this.f139344d;
        if (i17 >= ((java.util.concurrent.CopyOnWriteArrayList) list).size() || i17 < 0 || (aVar = (w33.a) ((java.util.concurrent.CopyOnWriteArrayList) list).get(i17)) == null) {
            return null;
        }
        return com.tencent.mm.plugin.game.chatroom.view.j1.b(aVar);
    }

    public void y(boolean z17) {
        java.util.List list = this.f139344d;
        ((java.util.concurrent.CopyOnWriteArrayList) list).clear();
        ((java.util.concurrent.CopyOnWriteArrayList) list).add(this.f139345e);
        this.f139350m = z17;
        com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView myChatRoomListView = this.f139352o;
        w33.a aVar = this.f139346f;
        java.util.List list2 = this.f139349i;
        if (z17) {
            aVar.f442704f.f442713a = true;
            ((java.util.concurrent.CopyOnWriteArrayList) list).addAll(list2);
            notifyItemRangeInserted(4, ((java.util.concurrent.CopyOnWriteArrayList) list2).size() - 3);
            myChatRoomListView.getClass();
        } else {
            ((java.util.concurrent.CopyOnWriteArrayList) list).addAll(((java.util.concurrent.CopyOnWriteArrayList) list2).subList(0, 3));
            aVar.f442704f.f442713a = false;
            androidx.recyclerview.widget.k3 p07 = myChatRoomListView.p0(3);
            if (p07 != null) {
                p07.itemView.getGlobalVisibleRect(new android.graphics.Rect());
            }
            myChatRoomListView.getClass();
            notifyItemRangeRemoved(4, ((java.util.concurrent.CopyOnWriteArrayList) list2).size() - 3);
        }
        ((java.util.concurrent.CopyOnWriteArrayList) list).add(aVar);
        notifyItemChanged(((java.util.concurrent.CopyOnWriteArrayList) list).size() - 1);
    }

    public synchronized void z(java.util.List list) {
        if (list != null) {
            java.util.LinkedList linkedList = new java.util.LinkedList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                linkedList.add(new w33.a(2, (com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo) it.next()));
            }
            this.f139352o.getClass();
            ((java.util.concurrent.CopyOnWriteArrayList) this.f139344d).clear();
            if (list.size() != 0) {
                ((java.util.concurrent.CopyOnWriteArrayList) this.f139344d).add(0, this.f139345e);
                ((java.util.concurrent.CopyOnWriteArrayList) this.f139349i).clear();
                ((java.util.concurrent.CopyOnWriteArrayList) this.f139349i).addAll(linkedList);
                if (list.size() <= 3 || !this.f139351n) {
                    ((java.util.concurrent.CopyOnWriteArrayList) this.f139344d).addAll(linkedList);
                } else {
                    if (this.f139346f.f442704f.f442713a) {
                        ((java.util.concurrent.CopyOnWriteArrayList) this.f139344d).addAll(1, linkedList);
                    } else {
                        ((java.util.concurrent.CopyOnWriteArrayList) this.f139344d).addAll(1, linkedList.subList(0, 3));
                        long j17 = 0;
                        for (int i17 = 3; i17 < list.size(); i17++) {
                            j17 += ((com.tencent.mm.plugin.game.autogen.chatroom.MyChatroomInfo) list.get(i17)).unread_msg_count;
                        }
                        if (j17 > 0) {
                            this.f139346f.f442704f.f442714b = true;
                        }
                    }
                    ((java.util.concurrent.CopyOnWriteArrayList) this.f139344d).add(this.f139346f);
                }
                if (!this.f139347g) {
                    this.f139347g = true;
                    org.json.JSONObject jSONObject = new org.json.JSONObject();
                    try {
                        jSONObject.put("GroupNum", linkedList.size());
                    } catch (org.json.JSONException unused) {
                    }
                    com.tencent.mm.game.report.f fVar = com.tencent.mm.game.report.g.f68195a;
                    com.tencent.mm.plugin.game.chatroom.view.MyChatRoomListView myChatRoomListView = this.f139352o;
                    fVar.k(1001L, 0L, 1L, 0L, myChatRoomListView.f139003i2, myChatRoomListView.f139002h2, "", "", jSONObject.toString());
                }
            }
            notifyDataSetChanged();
        }
    }
}
