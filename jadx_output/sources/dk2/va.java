package dk2;

/* loaded from: classes3.dex */
public final class va {
    public va(kotlin.jvm.internal.i iVar) {
    }

    public final dk2.wa a(android.content.Intent intent) {
        if (intent == null) {
            return null;
        }
        java.lang.String stringExtra = intent.getStringExtra("KEY_PARAMS_CONFIG_MORE_OPTION_UI_BUBBLE_KEY");
        if (stringExtra == null) {
            stringExtra = "";
        }
        dk2.va vaVar = dk2.wa.f234283b;
        com.tencent.mm.sdk.platformtools.Log.c("Finder.FinderLiveScrollSquareBundle", "getFromIntent " + intent.hashCode() + ", key:" + stringExtra, new java.lang.Object[0]);
        return (dk2.wa) dk2.wa.f234284c.get(stringExtra);
    }
}
