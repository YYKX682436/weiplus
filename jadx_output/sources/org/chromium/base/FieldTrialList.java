package org.chromium.base;

@org.chromium.build.annotations.MainDex
/* loaded from: classes16.dex */
public class FieldTrialList {

    /* loaded from: classes16.dex */
    public interface Natives {
        boolean createFieldTrial(java.lang.String str, java.lang.String str2);

        java.lang.String findFullName(java.lang.String str);

        java.lang.String getVariationParameter(java.lang.String str, java.lang.String str2);

        void logActiveTrials();

        boolean trialExists(java.lang.String str);
    }

    private FieldTrialList() {
    }

    public static boolean createFieldTrial(java.lang.String str, java.lang.String str2) {
        return org.chromium.base.FieldTrialListJni.get().createFieldTrial(str, str2);
    }

    public static java.lang.String findFullName(java.lang.String str) {
        return org.chromium.base.FieldTrialListJni.get().findFullName(str);
    }

    public static java.lang.String getVariationParameter(java.lang.String str, java.lang.String str2) {
        return org.chromium.base.FieldTrialListJni.get().getVariationParameter(str, str2);
    }

    public static void logActiveTrials() {
        org.chromium.base.FieldTrialListJni.get().logActiveTrials();
    }

    public static boolean trialExists(java.lang.String str) {
        return org.chromium.base.FieldTrialListJni.get().trialExists(str);
    }
}
