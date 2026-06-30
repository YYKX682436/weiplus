package com.tencent.mm.plugin.finder.profile;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/tencent/mm/plugin/finder/profile/FinderProfileAllLayoutConfig$getItemConvertFactory$1", "Lin5/s;", "", "type", "Lin5/r;", "getItemConvert", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderProfileAllLayoutConfig$getItemConvertFactory$1 implements in5.s {
    final /* synthetic */ yz5.l $extraMap;
    final /* synthetic */ com.tencent.mm.plugin.finder.profile.d this$0;

    public FinderProfileAllLayoutConfig$getItemConvertFactory$1(com.tencent.mm.plugin.finder.profile.d dVar, yz5.l lVar) {
        this.this$0 = dVar;
        this.$extraMap = lVar;
    }

    @Override // in5.s
    public in5.r getItemConvert(int type) {
        in5.r rVar;
        if (type == 4 || type == 9 || type == 2) {
            com.tencent.mm.plugin.finder.convert.dt dtVar = new com.tencent.mm.plugin.finder.convert.dt(true, null, true, 0, 10, null);
            dtVar.G = java.lang.Boolean.valueOf(this.this$0.f123332c);
            return dtVar;
        }
        if (type == 628) {
            com.tencent.mm.plugin.finder.convert.ft ftVar = new com.tencent.mm.plugin.finder.convert.ft();
            ftVar.f103422q = java.lang.Boolean.valueOf(this.this$0.f123332c);
            return ftVar;
        }
        if (type == 629) {
            com.tencent.mm.plugin.finder.convert.ft ftVar2 = new com.tencent.mm.plugin.finder.convert.ft();
            ftVar2.f103422q = java.lang.Boolean.valueOf(this.this$0.f123332c);
            return ftVar2;
        }
        if (type == so2.c5.class.hashCode()) {
            return new com.tencent.mm.plugin.finder.convert.xt();
        }
        if (type == so2.q2.class.hashCode()) {
            return new com.tencent.mm.plugin.finder.convert.wt();
        }
        if (type == js2.b.class.hashCode()) {
            return new com.tencent.mm.plugin.finder.convert.qs();
        }
        if (type == js2.a.class.hashCode()) {
            return new com.tencent.mm.plugin.finder.convert.ms();
        }
        if (type == com.tencent.mm.plugin.finder.playlist.e.class.hashCode()) {
            return new com.tencent.mm.plugin.finder.playlist.b2();
        }
        if (type == so2.m0.class.getName().hashCode()) {
            android.app.Activity context = this.this$0.f123330a;
            kotlin.jvm.internal.o.g(context, "context");
            pf5.z zVar = pf5.z.f353948a;
            if (context instanceof androidx.appcompat.app.AppCompatActivity) {
                return new com.tencent.mm.plugin.finder.convert.q2(context, ((com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).getUsername(), com.tencent.mm.plugin.finder.profile.d.f(this.this$0));
            }
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (type == ms2.c.class.hashCode()) {
            return new com.tencent.mm.plugin.finder.convert.fu(this.this$0.f123332c);
        }
        if (type == nr2.m.class.hashCode()) {
            return new com.tencent.mm.plugin.finder.convert.st(true, this.this$0.f123333d);
        }
        if (type == so2.o0.class.getName().hashCode()) {
            android.app.Activity context2 = this.this$0.f123330a;
            kotlin.jvm.internal.o.g(context2, "context");
            pf5.z zVar2 = pf5.z.f353948a;
            if (context2 instanceof androidx.appcompat.app.AppCompatActivity) {
                return new com.tencent.mm.plugin.finder.convert.y2(((com.tencent.mm.plugin.finder.profile.uic.p2) zVar2.a((androidx.appcompat.app.AppCompatActivity) context2).a(com.tencent.mm.plugin.finder.profile.uic.p2.class)).getUsername(), com.tencent.mm.plugin.finder.profile.d.f(this.this$0));
            }
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (type == js2.c.class.hashCode()) {
            return new com.tencent.mm.plugin.finder.convert.vs();
        }
        if (type == zb2.a.class.hashCode()) {
            return new com.tencent.mm.plugin.finder.convert.ss();
        }
        yz5.l lVar = this.$extraMap;
        if (lVar != null && (rVar = (in5.r) lVar.invoke(java.lang.Integer.valueOf(type))) != null) {
            return rVar;
        }
        this.this$0.getClass();
        java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
        com.tencent.mm.sdk.platformtools.Log.c("FinderGridLayoutConfig", "type invalid", new java.lang.Object[0]);
        return new com.tencent.mm.plugin.finder.convert.z2();
    }
}
