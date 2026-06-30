package com.tencent.mm.plugin.shake.model;

/* loaded from: classes11.dex */
public class ShakeMgrImpl implements o25.v1 {
    public void attachAvatarDrawable(android.widget.ImageView imageView, int i17, java.lang.String str, java.lang.String str2) {
        android.graphics.Paint paint = i34.d.f288311m;
        if (4 != i17 && (!h34.z.d(i17) || 6 == i17)) {
            ((com.tencent.mm.feature.avatar.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(imageView, str2, null);
            return;
        }
        if (4 != i17) {
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
        }
        imageView.post(new i34.a(imageView, str2, -1, str, i17));
    }

    @Override // o25.v1
    public void checkShakeCardEntrance() {
        g34.a.a();
    }

    @Override // o25.v1
    public void clearShakeCardEntranceData() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil clearShakeCardEntranceData()");
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_BEGIN_TIME_INT_SYNC, 0);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_END_TIME_INT_SYNC, 0);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_NAME_STRING_SYNC, "");
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ACTIVITY_TYPE_INT_SYNC, 0);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_FLOW_CONTROL_LEVEL_MIN_INT_SYNC, 0);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_FLOW_CONTROL_LEVEL_MAX_INT_SYNC, 0);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_TIP_STRING_SYNC, "");
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().p(262154, false);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_ID_STRING_SYNC, "");
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_DESC_STRING_SYNC, "");
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_TEXT_STRING_SYNC, "");
    }

    public java.lang.String getAttachAvatarDrawablePath(java.lang.String str) {
        return i34.d.b(str);
    }

    public int getShakeItemMusicType() {
        return 4;
    }

    @Override // o25.v1
    public int getShakeMessageUnreadCnt() {
        return c34.h0.Ri().f();
    }

    @Override // o25.v1
    public boolean isShakeCardEntranceOpen() {
        return g34.a.g();
    }

    @Override // o25.v1
    public boolean isShowShakeTV() {
        return h34.z.e();
    }

    @Override // o25.v1
    public void setShakeCardEntranceData() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ShakeCardUtil", "ShakeCardUtil setShakeCardEntranceData()");
        int currentTimeMillis = (int) (java.lang.System.currentTimeMillis() / 1000);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_BEGIN_TIME_INT_SYNC, java.lang.Integer.valueOf(currentTimeMillis));
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_END_TIME_INT_SYNC, java.lang.Integer.valueOf(86400 + currentTimeMillis));
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_NAME_STRING_SYNC, "");
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ACTIVITY_TYPE_INT_SYNC, 0);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_FLOW_CONTROL_LEVEL_MIN_INT_SYNC, 1);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_FLOW_CONTROL_LEVEL_MAX_INT_SYNC, 6);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_TIP_STRING_SYNC, "");
        ((c70.e) ((d70.i) i95.n0.c(d70.i.class))).getClass();
        bk0.a.g().p(262154, true);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_ID_STRING_SYNC, "" + currentTimeMillis);
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_DESC_STRING_SYNC, "hello");
        c01.d9.b().p().x(com.tencent.mm.storage.u3.USERINFO_SHAKE_CARD_ENTRANCE_RED_DOT_TEXT_STRING_SYNC, "shake card");
    }
}
