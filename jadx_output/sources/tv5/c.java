package tv5;

/* loaded from: classes12.dex */
public abstract class c {
    public static java.lang.String a(com.tencent.tinker.entry.ApplicationLike applicationLike) {
        if (applicationLike == null || applicationLike.getApplication() == null) {
            throw new com.tencent.tinker.loader.TinkerRuntimeException("tinkerApplication is null");
        }
        android.content.Intent tinkerResultIntent = applicationLike.getTinkerResultIntent();
        if (tinkerResultIntent == null) {
            return null;
        }
        java.lang.String stringExtra = com.tencent.tinker.loader.shareutil.ShareIntentUtil.getStringExtra(tinkerResultIntent, com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_OLD_VERSION);
        java.lang.String stringExtra2 = com.tencent.tinker.loader.shareutil.ShareIntentUtil.getStringExtra(tinkerResultIntent, com.tencent.tinker.loader.shareutil.ShareIntentUtil.INTENT_PATCH_NEW_VERSION);
        boolean isInMainProcess = com.tencent.tinker.loader.shareutil.ShareTinkerInternals.isInMainProcess(applicationLike.getApplication());
        if (stringExtra == null || stringExtra2 == null) {
            return null;
        }
        return isInMainProcess ? stringExtra2 : stringExtra;
    }
}
