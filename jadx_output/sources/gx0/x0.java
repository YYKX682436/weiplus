package gx0;

/* loaded from: classes5.dex */
public final class x0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig f277147d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(com.tencent.mm.mj_publisher.finder.movie_composing.uic.MovieComposingConfig movieComposingConfig) {
        super(0);
        this.f277147d = movieComposingConfig;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        com.tencent.mm.plugin.recordvideo.jumper.RecordConfigProvider recordConfigProvider = this.f277147d.f69348m;
        if (recordConfigProvider == null) {
            return null;
        }
        android.os.Bundle bundle = recordConfigProvider.M;
        java.lang.String string = bundle != null ? bundle.getString("KEY_ORIGIN_MUSIC_PATH") : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(string)) {
            android.os.Bundle bundle2 = recordConfigProvider.M;
            if (bundle2 != null) {
                return (com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo) bundle2.getParcelable("KEY_SELECT_AUDIO_INFO");
            }
            return null;
        }
        android.os.Bundle bundle3 = recordConfigProvider.M;
        int i17 = bundle3 != null ? bundle3.getInt("KEY_ORIGIN_MUSIC_PLAY_DURATION", 0) : 0;
        if (i17 <= 0) {
            i17 = 1;
        }
        android.os.Bundle bundle4 = recordConfigProvider.M;
        if (bundle4 == null || (str = bundle4.getString("KEY_ORIGIN_MUSIC_AUTHOR")) == null) {
            str = "";
        }
        java.util.ArrayList d17 = !kotlin.jvm.internal.o.b(str, "") ? kz5.c0.d(str) : new java.util.ArrayList();
        android.os.Bundle bundle5 = recordConfigProvider.M;
        if (bundle5 == null || (str2 = bundle5.getString("KEY_ORIGIN_MUSIC_COVER_URL")) == null) {
            str2 = "";
        }
        android.os.Bundle bundle6 = recordConfigProvider.M;
        if (bundle6 == null || (str3 = bundle6.getString("KEY_ORIGIN_MUSIC_NAME")) == null) {
            str3 = "";
        }
        com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo audioCacheInfo = new com.tencent.mm.plugin.recordvideo.model.audio.AudioCacheInfo();
        java.lang.String string2 = recordConfigProvider.M.getString("KEY_FINDER_POST_MUSIC_FEEDID");
        audioCacheInfo.C = string2 != null ? string2 : "";
        audioCacheInfo.f155711e = (int) java.lang.System.currentTimeMillis();
        android.os.Bundle bundle7 = recordConfigProvider.M;
        audioCacheInfo.f155719p = bundle7 != null ? bundle7.getBoolean("KEY_BGM_IF_ORIGIN") : false ? 1 : 2;
        audioCacheInfo.f155716m = true;
        audioCacheInfo.f155722s = true;
        audioCacheInfo.f155715i = string;
        audioCacheInfo.f155723t = str3;
        audioCacheInfo.f155720q = i17;
        audioCacheInfo.f155725v = str2;
        audioCacheInfo.f155714h = d17;
        audioCacheInfo.I = 10000;
        return audioCacheInfo;
    }
}
