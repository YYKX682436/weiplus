package e34;

/* loaded from: classes11.dex */
public class m extends com.tencent.mm.sdk.event.n {
    public m() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.MusicActionEvent musicActionEvent = (com.tencent.mm.autogen.events.MusicActionEvent) iEvent;
        if (!(musicActionEvent instanceof com.tencent.mm.autogen.events.MusicActionEvent)) {
            return false;
        }
        am.gk gkVar = musicActionEvent.f54509g;
        int i17 = gkVar.f6770a;
        am.hk hkVar = musicActionEvent.f54510h;
        if (i17 != -4) {
            if (i17 != 12) {
                return false;
            }
            hkVar.f6841e = i34.d.b(gkVar.f6776g);
            return false;
        }
        android.database.Cursor rawQuery = c34.h0.Ni().rawQuery("select shakeitem1.shakeItemID,shakeitem1.username,shakeitem1.nickname,shakeitem1.province,shakeitem1.city,shakeitem1.signature,shakeitem1.distance,shakeitem1.sex,shakeitem1.imgstatus,shakeitem1.hasHDImg,shakeitem1.insertBatch,shakeitem1.reserved1,shakeitem1.reserved2,shakeitem1.reserved3,shakeitem1.reserved4,shakeitem1.type,shakeitem1.lvbuffer,shakeitem1.regionCode,shakeitem1.snsFlag,shakeitem1.sns_bgurl from shakeitem1   where type = ? order by shakeItemID desc ", "4");
        hkVar.f6839c = new java.util.ArrayList();
        while (rawQuery != null && rawQuery.moveToNext()) {
            c34.r rVar = new c34.r();
            rVar.convertFrom(rawQuery);
            ((java.util.ArrayList) hkVar.f6839c).add(h34.v.b(rVar.field_lvbuffer, 0L));
        }
        if (rawQuery == null) {
            return false;
        }
        rawQuery.close();
        return false;
    }
}
