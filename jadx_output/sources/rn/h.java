package rn;

/* loaded from: classes11.dex */
public class h extends dm.e6 {

    /* renamed from: v, reason: collision with root package name */
    public static final l75.e0 f397603v = dm.e6.initAutoDBInfo(rn.h.class);

    /* renamed from: t, reason: collision with root package name */
    public final java.util.LinkedList f397604t = new java.util.LinkedList();

    /* renamed from: u, reason: collision with root package name */
    public final java.util.LinkedList f397605u = new java.util.LinkedList();

    public h() {
        this.field_queryState = 0;
    }

    public static java.lang.String u0(java.util.List list) {
        org.json.JSONArray jSONArray = new org.json.JSONArray();
        try {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                com.tencent.mm.chatroom.storage.GroupToolItem groupToolItem = (com.tencent.mm.chatroom.storage.GroupToolItem) it.next();
                org.json.JSONObject jSONObject = new org.json.JSONObject();
                jSONObject.put(dm.i4.COL_USERNAME, groupToolItem.f63682d);
                jSONObject.put(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, groupToolItem.f63683e);
                jSONObject.put(dm.i4.COL_UPDATETIME, groupToolItem.f63684f);
                jSONArray.put(jSONObject);
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.roomtools.GroupTools", "getToolsJsonStr() Exception:%s", e17.getMessage());
        }
        return jSONArray.toString();
    }

    @Override // dm.e6, l75.f0
    public void convertFrom(android.database.Cursor cursor) {
        super.convertFrom(cursor);
        java.util.LinkedList linkedList = this.f397604t;
        linkedList.clear();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(this.field_stickToollist)) {
            try {
                org.json.JSONArray jSONArray = new org.json.JSONArray(this.field_stickToollist);
                int length = jSONArray.length();
                for (int i17 = 0; i17 < length; i17++) {
                    org.json.JSONObject jSONObject = new org.json.JSONObject(jSONArray.getString(i17));
                    com.tencent.mm.chatroom.storage.GroupToolItem groupToolItem = new com.tencent.mm.chatroom.storage.GroupToolItem();
                    java.lang.String string = jSONObject.getString(dm.i4.COL_USERNAME);
                    if (string == null) {
                        string = "";
                    }
                    groupToolItem.f63682d = string;
                    java.lang.String string2 = jSONObject.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                    if (string2 == null) {
                        string2 = "";
                    }
                    groupToolItem.f63683e = string2;
                    linkedList.add(groupToolItem);
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.roomtools.GroupTools", "parseStickTools() Exception:%s", e17.getMessage());
            }
        }
        java.util.LinkedList linkedList2 = this.f397605u;
        linkedList2.clear();
        if (com.tencent.mm.sdk.platformtools.t8.K0(this.field_recentUseToolList)) {
            return;
        }
        try {
            org.json.JSONArray jSONArray2 = new org.json.JSONArray(this.field_recentUseToolList);
            int length2 = jSONArray2.length();
            for (int i18 = 0; i18 < length2; i18++) {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONArray2.getString(i18));
                com.tencent.mm.chatroom.storage.GroupToolItem groupToolItem2 = new com.tencent.mm.chatroom.storage.GroupToolItem();
                java.lang.String string3 = jSONObject2.getString(dm.i4.COL_USERNAME);
                if (string3 == null) {
                    string3 = "";
                }
                groupToolItem2.f63682d = string3;
                java.lang.String string4 = jSONObject2.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH);
                if (string4 == null) {
                    string4 = "";
                }
                groupToolItem2.f63683e = string4;
                groupToolItem2.f63684f = jSONObject2.getLong(dm.i4.COL_UPDATETIME);
                linkedList2.add(groupToolItem2);
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.roomtools.GroupTools", "parseRecentUseTools() Exception:%s", e18.getMessage());
        }
    }

    public boolean equals(java.lang.Object obj) {
        return com.tencent.mm.sdk.platformtools.t8.D0(((rn.h) obj).field_chatroomname, this.field_chatroomname);
    }

    @Override // dm.e6, l75.f0
    public l75.e0 getDBInfo() {
        return f397603v;
    }

    public void t0(com.tencent.mm.chatroom.storage.GroupToolItem groupToolItem) {
        java.util.LinkedList linkedList = this.f397605u;
        if (linkedList.contains(groupToolItem)) {
            linkedList.remove(groupToolItem);
        }
        linkedList.add(groupToolItem);
        java.util.Collections.sort(linkedList, new rn.g(this));
        if (linkedList.size() > 20) {
            linkedList.remove(linkedList.size() - 1);
        }
        this.field_recentUseToolList = u0(linkedList);
    }

    public boolean v0() {
        return this.f397604t.size() >= 8;
    }
}
