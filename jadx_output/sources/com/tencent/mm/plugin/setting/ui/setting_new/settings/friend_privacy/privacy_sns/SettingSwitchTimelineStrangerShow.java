package com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.privacy_sns;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting_new/settings/friend_privacy/privacy_sns/SettingSwitchTimelineStrangerShow;", "Ls24/g;", "Landroidx/appcompat/app/AppCompatActivity;", com.tencent.tinker.loader.hotplug.EnvConsts.ACTIVITY_MANAGER_SRVNAME, "<init>", "(Landroidx/appcompat/app/AppCompatActivity;)V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public final class SettingSwitchTimelineStrangerShow extends s24.g {

    /* renamed from: h, reason: collision with root package name */
    public final r45.cb6 f161944h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f161945i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f161946m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f161947n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0038, code lost:
    
        if ((r4.f371431g & 1) <= 0) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public SettingSwitchTimelineStrangerShow(androidx.appcompat.app.AppCompatActivity r4) {
        /*
            r3 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.o.g(r4, r0)
            r3.<init>(r4)
            r45.cb6 r4 = new r45.cb6
            r4.<init>()
            r3.f161944h = r4
            java.lang.String r4 = c01.z1.r()
            r3.f161945i = r4
            r0 = 1
            r3.f161946m = r0
            p94.j0 r1 = p94.w0.c()
            if (r1 == 0) goto L2a
            p94.j0 r1 = p94.w0.c()
            com.tencent.mm.plugin.sns.storage.e2 r1 = (com.tencent.mm.plugin.sns.storage.e2) r1
            r45.cb6 r4 = r1.b1(r4)
            r3.f161944h = r4
        L2a:
            r45.cb6 r4 = r3.f161944h
            r1 = 0
            if (r4 == 0) goto L3b
            java.lang.String r2 = "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.SnsUserInfo"
            kotlin.jvm.internal.o.e(r4, r2)
            int r4 = r4.f371431g
            r4 = r4 & r0
            if (r4 > 0) goto L3b
            goto L3c
        L3b:
            r0 = r1
        L3c:
            r3.f161947n = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.privacy_sns.SettingSwitchTimelineStrangerShow.<init>(androidx.appcompat.app.AppCompatActivity):void");
    }

    @Override // a24.i
    public java.lang.String a7() {
        return "SettingGroup_Main_FriendPrivacy_PrivacySns_StrangerShow";
    }

    @Override // a24.i
    public a24.u b7() {
        return new a24.u(com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.SettingActivityItemPrivacySns.class, com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.privacy_sns.SettingActivityItemEditTimelineGroup.class);
    }

    @Override // s24.g, a24.a, a24.i
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // a24.i
    public int d7() {
        return com.tencent.mm.R.string.pbz;
    }

    @Override // a24.i
    public java.lang.Class e7() {
        return com.tencent.mm.plugin.setting.ui.setting_new.settings.friend_privacy.SettingActivityItemPrivacySns.class;
    }

    @Override // a24.i
    /* renamed from: m7 */
    public int getF161972p() {
        return 3;
    }

    @Override // a24.i
    /* renamed from: q7 */
    public boolean getF161948p() {
        if (c01.e2.a0() && ((uh4.c0) i95.n0.c(uh4.c0.class)).isTeenMode()) {
            this.f161946m = false;
        } else {
            this.f161946m = ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("ForbidSnsStranger", 0) == 0;
        }
        return this.f161946m;
    }

    @Override // s24.g
    /* renamed from: x7 */
    public al5.c2 getF161961h() {
        return new i24.c(this);
    }

    @Override // s24.g
    /* renamed from: y7, reason: from getter */
    public boolean getF161950h() {
        return this.f161947n;
    }
}
